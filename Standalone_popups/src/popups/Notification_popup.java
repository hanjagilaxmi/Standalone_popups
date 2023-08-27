package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");	
		driver.close();
	}
}
