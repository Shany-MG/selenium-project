package com.way2_radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shany MG\\Downloads\\LOG4JFILEEX\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com/way2auto_jquery/registration.php#load_box");
		
		List<WebElement> RADIOBUTTONS =	driver.findElements(By.xpath("//input[@type='checkbox'][@name='hobby']"));
	WebElement rt =	RADIOBUTTONS.get(0);
	rt.click();
		
	


	}

}
