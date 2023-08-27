package autoit12thjuly;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup_using_Autoit {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		Thread.sleep(2000);
		driver.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("C:\\Users\\deepa\\OneDrive\\Desktop\\QSP\\AutoIT\\auto.exe");
	}
}
