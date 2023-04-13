package elementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssExample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
//	WebElement searchfield=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//	searchfield.sendKeys("Clothes");
	
	WebElement searchfield1=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
	searchfield1.sendKeys("laptops");
}
}
