package org.allpages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderID extends BaseClass{
	
	public OrderID() {
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	@FindBy(id="my_itinerary")
	private WebElement bookedList;
	
	public WebElement getOrderNo() {
		return orderNo;
	}
		
	public WebElement getBookedList() {
		return bookedList;
	}

}
