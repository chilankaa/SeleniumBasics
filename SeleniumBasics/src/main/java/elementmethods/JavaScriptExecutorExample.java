package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchfield.sendKeys("Shoes");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("alert('XXX')");
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		js.executeScript("arguments[0].click();",searchbutton);
		js.executeScript("window.scrollBy(0,6000)");
	}

}
