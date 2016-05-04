package saleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign3 {

	public static void main(String[] args) {
		String Ourl="http://www.Store.DemoQA.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Ourl);
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("Title Length"  + title.length());
		String Gurl = driver.getCurrentUrl();
		if(Ourl==Gurl){
			System.out.println("Required page is opened");
		}else{
			System.out.println("Required page is not opened");
		}
		String source=driver.getPageSource();
		System.out.println(source);
		System.out.println("PageSource : "+source.length());
		driver.close();
		
	}

}
