package saleniumdemo;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		String service = "F:\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}

}
