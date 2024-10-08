package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_page {
	public WebDriver driver;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(name="datepick_in")
	private WebElement datepick_in;
	
	@FindBy(name="datepick_out")
	private WebElement datepick_out;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(name="Submit")
	private WebElement submit;
	
	public Search_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return room_type;
	}
	public WebElement getRoomno() {
		return room_nos;
	}
	public WebElement getDatepick() {
		return datepick_in;
	}
	public WebElement getDatepickout() {
		return datepick_out;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}

	

}
