package saleniumdemo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign11 {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		//driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String pSource=driver.getPageSource();
		System.out.println(pSource);
		//driver.close();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String fName=sc.next();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fName);
		System.out.println("Enter Last Name");
		String lName=sc.next();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lName);
		System.out.println("Enter sex");
		String sex=sc.next();
		driver.findElement(By.xpath("//input[@value='sex']")).click();
		//driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//*[@id='exp-6']")).click();
		driver.findElement(By.xpath("//input[@id='profession-0']")).click();
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-0']")).click();
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		driver.findElement(By.xpath("//select[@id='continents']/option[text()='Antartica']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Browser Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Navigation Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Switch Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='Wait Commands']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']/option[text()='WebElement Commands']")).click();
	}
}
