package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement button1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button1.click();
		driver.switchTo().alert().accept();
		WebElement button2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button2.click();
		driver.switchTo().alert().dismiss();
		WebElement button3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button3.click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
	}
	

}
