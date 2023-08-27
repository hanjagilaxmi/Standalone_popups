package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize_Browser {
	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("start-maximized","--incognito");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.facebook.com");
		driver.close();
	}
}
