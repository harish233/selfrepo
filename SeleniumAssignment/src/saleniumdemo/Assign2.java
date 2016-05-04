package saleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/frames-and-windows/");
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		driver.close();
	}

}
