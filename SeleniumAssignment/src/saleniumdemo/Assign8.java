package saleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Select dropSelect = new Select(driver.findElement(By.id("continents")));
		dropSelect.selectByIndex(1);
		dropSelect.selectByVisibleText("Africa");
		Select oSelect = new Select(driver.findElement(By.id("continents")));
		List<WebElement> ops= oSelect.getOptions();
		int oSize=ops.size();
		for(int i=0;i<oSize;i++){
			String text=ops.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
