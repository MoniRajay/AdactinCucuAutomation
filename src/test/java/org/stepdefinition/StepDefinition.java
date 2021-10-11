package org.stepdefinition;

import org.allpages.FillDetailspage;
import org.allpages.LoginPage;
import org.allpages.OrderID;
import org.allpages.SelectHotelPage;
import org.baseclass.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Given("User is in Adactin Web page")
	public void user_is_in_Adactin_Web_page() {
		 launchBrowser("https://adactinhotelapp.com/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		LoginPage a = new LoginPage();
		sendData(a.getUserName(), "Jayaprakashjp");
		sendData(a.getPassWord(), "Jpshiva@96");
	}

	@And("clicks on login")
	public void clicks_on_login() {
		LoginPage a = new LoginPage();
		a.getLogin().click();
	}

	@Then("validate it is in search hotel page")
	public void validate_it_is_in_search_hotel_page() {
	    currentUrl("SearchHotel");
	}

	@When("user enters location, hotel, roomtype")
	public void user_enters_location_hotel_roomtype() {
		SelectHotelPage b = new SelectHotelPage();
		selectList(b.getLocation(), "Adelaide");
		selectList(b.getHotels(), "Hotel Hervey");
		selectList(b.getRoomType(), "Super Deluxe");
		selectList(b.getAdults(), "2");
	}

	@When("clicks on submit button")
	public void clicks_on_submit_button() {
		SelectHotelPage b = new SelectHotelPage();
		b.getSubmit().click();
	}

	@Then("validate it is in select hotel page")
	public void validate_it_is_in_select_hotel_page() {
	    currentUrl("SelectHotel");
	}

	@When("user clicks on radio button and continue button")
	public void user_clicks_on_radio_button_and_continue_button() {
		SelectHotelPage b = new SelectHotelPage();
		b.getRadiobtn().click();
		b.getCont().click();
	}

	@Then("validate it is in book hotel page")
	public void validate_it_is_in_book_hotel_page() {
	    currentUrl("BookHotel");
	}

	@When("user enters firstname, lastname, address and creditcardnum")
	public void user_enters_firstname_lastname_address_and_creditcardnum() {
		FillDetailspage c = new FillDetailspage();
		sendData(c.getFirstName(), "Mo");
		sendData(c.getLastName(), "Jay");
		sendData(c.getAddress(), "Address");
		sendData(c.getCcNum(), "1234567890123456");
	}

	@When("user slects creditcardtype, expmonth, expyear and enters cvvnum")
	public void user_slects_creditcardtype_expmonth_expyear_and_enters_cvvnum() {
		FillDetailspage c = new FillDetailspage();
		selectList(c.getCcType(), "AMEX");
		selectList(c.getExpMonth(), "6");
		selectList(c.getExpYear(), "2022");
		sendData(c.getCvvNum(), "123"); 
	}

	@When("clicks on book hotel button")
	public void clicks_on_book_hotel_button() throws InterruptedException {
		FillDetailspage c = new FillDetailspage();
		c.getBookNowBtn().click();
		Thread.sleep(6000);
	}

	@Then("validate the order id is displayed")
	public void validate_the_order_id_is_displayed() {
		OrderID id = new OrderID();
	    currentUrl("BookingConfirm");
	    print(id.getOrderNo());
	    id.getBookedList().click();
	    orderId();
	}


}
