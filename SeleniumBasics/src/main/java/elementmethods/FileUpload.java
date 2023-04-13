package elementmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement choosefile=driver.findElement(By.xpath("//input[@name='file']"));
//		choosefile.sendKeys("E:\\Selenium\\Doc1.pdf");
		File choose=new File("E:\\Selenium\\Doc1.pdf");
		choosefile.sendKeys(choose.getAbsolutePath());
		WebElement upload=driver.findElement(By.xpath("//input[@type='submit']"));
		upload.click();
	}

}
