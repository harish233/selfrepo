package saleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign4 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.DemoQA.com");
		driver.findElement(By.xpath("//li[@id='menu-item-374']/a[text()='Registration']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.DemoQA.com");
		driver.navigate().refresh();
		driver.close();
	}
}
