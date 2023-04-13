package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement check=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		WebElement check1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement check2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		check2.click();
		WebElement check3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement check4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		check4.click();
		
		if(!check.isSelected()) {
			check.click();
		}
		if(!check1.isSelected()) {
			check1.click();
		}
		if(!check2.isSelected()) {
			check2.click();
		}
		if(!check3.isSelected()) {
			check3.click();
		}
		if(!check4.isSelected()) {
			check4.click();
		}
//		System.out.println(check.getLocation().getX());//x-coordinate
//		System.out.println(check.getLocation().getY());//y-coordinate
	}

}
