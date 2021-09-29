package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {
public static void main(String[]args) {
	String baseUrl = "http://www.facebook.com/";
	WebDriver driver = new FirefoxDriver();
	driver.get(baseUrl);
	WebElement txtUsername = driver.findElement(By.id("email"));
	Actions builder = new Actions(driver);
	Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendkeys(txtUsername, "hello")
			.keyup(txtUsername, keys.SHIFT)
			.doubleClick
			
}

}
