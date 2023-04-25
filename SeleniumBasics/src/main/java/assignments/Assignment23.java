package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(" https://selenium.obsqurazone.com/bootstrap-alert.php");
		WebElement normal_success=driver.findElement(By.id("normal-btn-success"));
		normal_success.click();
		WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']"));
		System.out.println(alert.getText());
	}

}
