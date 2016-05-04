package saleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign10 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-table/");
		String sRow="1";
		String sCol="2";
		String cellValue=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
		System.out.println(cellValue);
		
		String rowValue="Clock Tower Hotel";
		for(int i=1;i<=5;i++){
			String text = null;
			text=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+ i +"]/th")).getText();
			if(text.equalsIgnoreCase(rowValue)){
				for(int j=1;j<=5;j++){
					String cText=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+ i +"]/td["+ j +"]")).getText();
					System.out.println(cText);
				}
			break;	
			}
		}
		driver.close();
	}

}
