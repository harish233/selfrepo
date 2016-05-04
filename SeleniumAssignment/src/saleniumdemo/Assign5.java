package saleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname")).sendKeys("Harish");
		driver.findElement(By.name("lastname")).sendKeys("Lade");
		driver.findElement(By.id("submit")).submit();
	}

}
