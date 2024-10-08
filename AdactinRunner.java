package com.selenium;

import com.poma.PageObjectManager;

public class AdactinRunner extends Base_Class {
	

	public static void main(String[] args) throws InterruptedException {
		 browserLaunch("chrome");
		 openUrl("https://adactinhotelapp.com/");	 
		 PageObjectManager pom = new PageObjectManager(driver);		 
		 maxMium();
		 impliciWait(30);
//Log in page
		 sendInputs(pom.getLp().getUsername(),"Thulasi");
		 sendInputs(pom.getLp().getPassword(),"Krish@19");
		 clickButton(pom.getLp().getLogin());	 
//search page	 
		 selectByVisibleText(pom.getSp().getLocation(),"Paris");
		 selectByValue(pom.getSp().getHotels(),"Hotel Sunshine");
		 selectByValue(pom.getSp().getRoomtype(),"Super Deluxe");
		 selectByVisibleText(pom.getSp().getRoomno(),"3 - Three");
		 dataClear(pom.getSp().getDatepick());
		 sendInputs(pom.getSp().getDatepick(),"15/09/2024");
		 dataClear(pom.getSp().getDatepickout());
		 sendInputs(pom.getSp().getDatepickout(),"20/09/2024");
		 selectByValue(pom.getSp().getAdultroom(),"4");
		 selectByValue(pom.getSp().getChildroom(),"3");
		 clickButton(pom.getSp().getSubmit());		 
//select page		 
		 radioButton(pom.getSel().getRadiobutton());
		 clickButton(pom.getSel().getContinuebutton());		 
//booking page		 
		 sendInputs(pom.getBp().getFirstname(),"Thulasi");
		 sendInputs(pom.getBp().getLastname(),"Padmanaban");
		 sendInputs(pom.getBp().getAddress(),"Chennai");
		 sendInputs(pom.getBp().getCreditcard(),"4111111111111111");
		 selectByIndex(pom.getBp().getCcType(),3);
		 selectByValue(pom.getBp().getExpmonth(),"5");
		 selectByVisibleText(pom.getBp().getExpyear(),"2027");
		 sendInputs(pom.getBp().getCvv(),"001");
		 clickButton(pom.getBp().getBooknow());
		 Thread.sleep(5000);
		 screenShot("C:\\Users\\acer\\eclipse-workspace\\Main\\Screenshots\\ss1.png");		 
//		 scrollDown();
//		 screenShot("C:\\Users\\acer\\eclipse-workspace\\Main\\Screenshots\\ss3.png");
//log out
		 clickButton(pom.getLop().getLogout());
		 Thread.sleep(3000);
		 screenShot("C:\\Users\\acer\\eclipse-workspace\\Main\\Screenshots\\ss2.png");
//close		 
		 closeWindow();

	}

}

