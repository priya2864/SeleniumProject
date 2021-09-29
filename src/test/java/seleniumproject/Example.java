package seleniumproject;


	//package com.picnic.selenium1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Example {
	
		//public static void main(String[]args) throws InterruptedException {
	@Test
	public void sample() throws InterruptedException{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\priyavi\\eclipse-workspace-learning-selenium\\seleniumProject\\drivers\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\priyavi\\eclipse-workspace-learning-selenium\\seleniumProject\\drivers\\geckodriver.exe" );
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			Thread.sleep(2000);
			WebElement sample=driver.findElement(By.id("btnLogin"));
			sample.click();
			Thread.sleep(3000);
			driver.quit();
		}

	}




