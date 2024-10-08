package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

		public static WebDriver driver;
//1
		public static WebDriver browserLaunch(String browserName) {
			 if(browserName.equalsIgnoreCase("chrome")) {
				 driver = new ChromeDriver();
			 }
			 else if(browserName.equalsIgnoreCase("edge")) {
				 driver = new EdgeDriver();
			 }
			 else {
				 driver = new FirefoxDriver();
			 }			
			return driver;
		}
//2		
		 public static WebDriver openUrl(String url) {
			 try {
				 driver.get(url);
			 }catch (Exception e) {
				 System.out.println(e.getMessage());
			 }
			return driver;
		}
//3
		 public static void sendInputs(WebElement element,String input) {
			 try {
				 element.sendKeys(input);
			 }catch (Exception e) {
				 
			 }
			 }
//4			 
		 public static void clickButton(WebElement element) {
			 try {
				 element.click();
			 }catch(Exception e) {
				 
			 }
		}
//5
		 public static void navigateTo(String url) {
			 try {
				 driver.navigate().to(url); 
			 }catch(Exception e) {
				 
			 }
		}
//6
		 public static void navigateBack() {
			 try {
				 driver.navigate().back();
			 }catch(Exception e) {
				 
			 }
		}
//7
		 public static void navigateRefresh() {
			 try {
				 driver.navigate().refresh();
			 }catch(Exception e) {

		}
		}
//8
		 public static void navigateForward() {
			 try {
				 driver.navigate().forward();
			 }catch(Exception e) {
		}
		 }
//9
		 public static void currentTitle() {
			 try {
				System.out.println(driver.getTitle()); 
				 
			 }catch(Exception e) {
				 
			 }
		}
//10		 
		 public static void currentUrl() {
			 try {
				 System.out.println(driver.getCurrentUrl());
			 }catch(Exception e) {
				 
			 }
		}
//11
		 public static void impliciWait(int sec) {
			 try {
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
			 }catch(Exception e) {
				 
			 }
		}
//12		 
		 public static Actions mouseMove() {
			Actions action = new Actions(driver); 
			return action;
		}
		 public static void moveTo(WebElement src) {
			 try{
				 mouseMove().moveToElement(src).click().build().perform();
			 }catch(Exception e) {
				 
			 }
		 }
//13     
		public static void popUp(WebElement element) {
			try {
				Alert alert =driver.switchTo().alert();
				alert.accept();
			}catch(Exception e) {
				
			}
		}
//14
		public static void maxMium() {
			try {
				driver.manage().window().maximize();
			}catch(Exception e) {
				
			}
		}
//15		
		public static void screenShot(String location) {
			try {
				TakesScreenshot ss = (TakesScreenshot) driver;
				File source = ss.getScreenshotAs(OutputType.FILE);
				File destination = new File(location);
				FileHandler.copy(source, destination);
			}catch(Exception e) {
				
			}
		}
//16
		public static JavascriptExecutor javascriptExecutor(String script, WebElement element) {
			
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript(script,element);
				return js;
			
		}
//17
		public static void scrollDown(WebElement element) {
			try {
				javascriptExecutor("arguments[0].click();", element);
			}catch(Exception e) {
				
			}
		}
//18
		public static void keyPr(int value) throws AWTException {
			try {
			Robot r = new Robot();
			r.keyPress(value);
			r.keyRelease(value);
		}catch(Exception e) {
		 }
		}
//19
		public static void radioButton(boolean value, WebElement element) {
		    try {
		        element.click();
		    } catch (Exception e) {
		        
		    }
		}

//20
		public static boolean isSelect(WebElement element, boolean value) { 
		    try {
		        radioButton(value, element);
		    } catch (Exception e) {
		       
		    }
			return value;
		}

//21
		public static boolean isEnbale(WebElement element) {
		    try {
		        radioButton(true, element); 
		    } catch (Exception e) {
		        
		    }
			return true;
		}
//22
		public static boolean isDisplay(WebElement element) {
		    try {
		        radioButton(true, element); 
		    } catch (Exception e) {
		        
		    }
			return true;
		}
//23
		public static void isMultiple(WebElement element) {
		    try {
		        radioButton(true, element); 
		    } catch (Exception e) {
		     
		    }
		}

//24	
	 public static void terminateWindio() {
		 try {
			 driver.close();;
		 }catch(Exception e) {
		
	}
	 }
//25
	
	 public static void closeWindow() {
		 try {
			 driver.quit();
		 }catch(Exception e) {
		
	}
}
	 
//26	
	 private static Select dropDownObject(WebElement element) {
		 Select s = new Select(element);
		 return s;
	 }
	 public static void selectByValue(WebElement element,String value) {
		 try {
			 dropDownObject(element).selectByValue(value);
		 }catch(Exception e) {
			 
		 }
	 }
	 
	 public static void selectByIndex(WebElement element,int num) {
		 try {
			 dropDownObject(element).selectByIndex(num);
		 }catch(Exception e) {
			 
		 }
	 }
	 
	 public static void selectByVisibleText(WebElement element,String text) {
		 try {
			 dropDownObject(element).selectByVisibleText(text);
		 }catch(Exception e) {
			 
		 }
	 }
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			
		
}

