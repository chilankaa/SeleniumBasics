package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NameLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement searchfield=driver.findElement(By.name("email"));
		searchfield.sendKeys("chilankanath2013@gmail.com");
		searchfield.clear();
		WebElement password=driver.findElement(By.className("inputtext _55r1 _6luy _9npi"));
		password.sendKeys("Chilanka");
		
	}

}
