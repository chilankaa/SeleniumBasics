package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(" https://selenium.obsqurazone.com/form-submit.php");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		List<WebElement> error1 = driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		for (WebElement element : error1) {
			System.out.println(element.getText());
		}
		
	}

}
