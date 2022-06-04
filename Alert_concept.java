package com.seleneum2;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_concept {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\eclipse-workspace\\seleneum2\\driver4\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Alert.html");	
driver.manage().window().maximize();
WebElement simplealert = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
simplealert.click();
	Thread.sleep(3000);
	Alert alert = driver.switchTo().alert();
	Thread.sleep(3000);
	alert.accept();
		Thread.sleep(3000);	
	WebElement confirmalert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
	confirmalert.click();
	Alert alert2 = driver.switchTo().alert();
	Thread.sleep(3000);
	alert2.dismiss();
	Thread.sleep(3000);
	
	WebElement promptalert = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	promptalert.click();
	Alert alert3 = driver.switchTo().alert();
	Thread.sleep(3000);
	alert3.sendKeys("balaji");
	Thread.sleep(3000);
	alert3.accept();
	
	WebElement findElement = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
	findElement.click();
	Alert alert4 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert4.accept();
	
	WebElement findElement2 = driver.findElement(By.id("btn"));
	findElement2.click();
	Alert alert5 = driver.switchTo().alert();
	Thread.sleep(2000);
	alert5.accept();
	
	
	}

}
