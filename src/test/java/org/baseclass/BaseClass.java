package org.baseclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void sendData(WebElement element, String text) {
		element.sendKeys(text);		
	}
	
	public static void selectList(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void currentUrl(String text) {
		String url = driver.getCurrentUrl();
		boolean contains = url.contains(text);
		System.out.println(contains + " doing good ");
	}
	
	public static void print(WebElement element) {
		String orderid = element.getAttribute("value");
		System.out.println(orderid);
	}
	
	public static void orderId() {
		List<WebElement> orderlist = driver.findElements(By.xpath("//input[contains(@id,'order')]"));
		int size = orderlist.size();
		System.out.println("Total Booked: " + (size-1) +"");
		System.out.println("All Order id: ");		
		for (WebElement l : orderlist) {
			String id = l.getAttribute("value");
			System.out.println(id);
		}
		WebElement lastOrder = driver.findElement(By.xpath("(//input[contains(@id,'order')])["+size+"]"));
		String lastorderId = lastOrder.getAttribute("value");
		System.out.println("Latest order id: "+ lastorderId );
		
	}
	

}
