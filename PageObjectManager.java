package com.poma;

import org.openqa.selenium.WebDriver;

import com.pom.*;


public class PageObjectManager {

	public WebDriver driver;
	
	private Login_page lp;
	
	private Search_page sp;
	
	private Select_page sel;
	
	private Booking_page bp;
	
	private Logout_out lop;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public Login_page getLp() {
		
		if(lp == null) {
			lp=new Login_page(driver);
		}
		return lp;
	}
	
	public Search_page getSp() {
		if(sp == null) {
			sp=new Search_page(driver);
		}
		return sp;
		
	}
	
	public Select_page getSel() {
		if(sel == null) {
			sel=new Select_page(driver);
		}
		return sel;
		
	}
	
	public Booking_page getBp() {
		if(bp == null) {
			bp=new Booking_page(driver);
		}
		return bp;
		
	}
	public Logout_out getLop() {
		if(lop == null) {
			lop=new Logout_out(driver);
		}
		return lop;
		
	}

}
