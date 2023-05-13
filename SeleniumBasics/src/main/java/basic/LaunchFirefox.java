package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\firefoxdriver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().to("https://www.guru99.com/");
	driver.navigate().back();
}
}
