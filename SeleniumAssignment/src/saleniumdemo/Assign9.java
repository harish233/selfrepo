package saleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		String cellValue=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[text()='Dubai']")).getText();
		System.out.println(cellValue);
		driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[6]")).click();
		driver.close();
	}

}
