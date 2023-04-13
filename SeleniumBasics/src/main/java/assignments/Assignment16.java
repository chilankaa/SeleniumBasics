package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		WebElement button=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
		WebElement name=driver.findElement(By.xpath("//h5[@class='card-title']"));
		System.out.println(name.getText());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='card-text text-center p-3']")));
		WebElement mail=driver.findElement(By.xpath("//p[@class='card-text text-center p-3']"));
		System.out.println(mail.getText());
	}

}
