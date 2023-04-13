package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		WebElement button=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		button.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Cancel Download']")));
		WebElement message=driver.findElement(By.xpath("//div[@class='progress-label']"));
		System.out.println(message.getText());
	}

}
