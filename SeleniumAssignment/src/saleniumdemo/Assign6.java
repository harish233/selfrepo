package saleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.partialLinkText("Partial")).click();
		String tag=driver.findElement(By.tagName("button")).toString();
		System.out.println(tag);
		driver.findElement(By.linkText("Link Test")).click();
	}

}
