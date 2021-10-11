package org.allpages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindAll({@FindBy(id="radiobutton_3"),@FindBy(id="radiobutton_2"),@FindBy(id="radiobutton_1"), @FindBy(id="radiobutton_0")})
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement cont;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getCont() {
		return cont;
	}
	
	
	

}
