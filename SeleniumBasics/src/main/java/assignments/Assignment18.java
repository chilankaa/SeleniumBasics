package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//I. Use either this loop
		
//		WebElement checkbox = driver.findElement(By.xpath("//input[@class='form-check-input']"));
//		WebElement checkbox1 = driver.findElement(By.id("check-box-one"));
//		for (int i = 0; i < 2; i++) {
//			js.executeScript("arguments["+i+"].click();", checkbox, checkbox1);
//			checkbox = driver.findElement(By.xpath("//input[@class='form-check-input']"));
//			checkbox1 = driver.findElement(By.id("check-box-one"));
//		}
		
		//II. Or this loop
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement boxes : checkboxes) {
			js.executeScript("arguments[0].click();", boxes);
		}
		WebElement last_text=driver.findElement(By.xpath("//p[text()='© 2021 Obsqura Testing, All Rights Reserved.']"));
		js.executeScript("arguments[0].scrollIntoView()", last_text);
	}

}
