package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameSwitching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-right");
		WebElement right=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
		System.out.println(right.getText());
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(1);
		WebElement bottom=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(bottom.getText());
		driver.quit();
	}

}
