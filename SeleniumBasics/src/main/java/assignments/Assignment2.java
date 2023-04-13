package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement check=driver.findElement(By.className("form-check-label"));
		check.click();
		WebElement check1=driver.findElement(By.xpath("//label[@for='check-box-one']"));
		check1.click();
		WebElement check2=driver.findElement(By.xpath("//label[contains(text(),'Check Box Two')]"));
		check2.click();
		WebElement check3=driver.findElement(By.xpath("//label[@for='check-box-three']"));
		check3.click();
		WebElement check4=driver.findElement(By.xpath("//label[@for='check-box-four']"));
		check4.click();
	}

}
