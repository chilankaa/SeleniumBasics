package elementmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//implicit wait
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
		start.click();
//		Thread.sleep(7000);
		WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		System.out.println(text.getText());
	}

}
