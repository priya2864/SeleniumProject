package selenium_dd;
import org.openqa.selenium.*;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class IndividualActivity {
	 public static void main(String[] args) throws InterruptedException{

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\priyavi\\eclipse-workspace-learning-selenium\\seleniumProject\\drivers\\chromedriver.exe");
	

		 WebDriver driver = new ChromeDriver();

		 driver.get("https://www.saucedemo.com/");

		 driver.manage().window().maximize();

		 WebElement uname = driver.findElement(By.id("user-name"));

		 uname.sendKeys("standard_user");

		 Thread.sleep(2000);

		WebElement passwd = driver.findElement(By.xpath("//input[@id='password']"));

		 passwd.sendKeys("secret_sauce");

		 WebElement submit = driver.findElement(By.id("login-button"));

		 submit.click();

		 Thread.sleep(2000);

		 if(driver.findElement(By.className("app_logo")).isDisplayed())

		 {

		 System.out.println("Page Logo is present");

		 }

		 else {

		 System.out.println("Page Logo is not present");

		 }

		 driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie")).click();

		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();

		 Thread.sleep(2000);

		driver.findElement(By.id("checkout")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Priya");
		
		driver.findElement(By.id("last-name")).sendKeys("Vathana");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("600032");

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#continue")).click();
		
		driver.findElement(By.xpath("//button[@id='finish']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("back-to-products")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("logout_sidebar_link")).click();

		Thread.sleep(2000);

		Select logout = new Select(driver.findElement(By.id("logout_sidebar_link")));

		logout.selectByVisibleText("LOGOUT");

		 }

		 }


