package saleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign7 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> radio= driver.findElements(By.name("sex"));
		boolean bValue = false;
		bValue = radio.get(0).isSelected();
		if(bValue == false){
			radio.get(0).click();
		}else{
			radio.get(1).click();
		}
		driver.findElement(By.id("exp-2")).click();
		List<WebElement> checkbox=driver.findElements(By.name("profession"));
		int iSize=checkbox.size();
		for(int i=0;i<iSize; i++){
			String aValue=checkbox.get(i).getAttribute("value");
			if(aValue.equalsIgnoreCase("Automation Tester"));
				radio.get(i).click();
				break;
		}
		driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
	}

}
