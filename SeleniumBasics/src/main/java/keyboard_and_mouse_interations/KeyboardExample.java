package keyboard_and_mouse_interations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyboardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		searchfield.sendKeys("Shoes"+Keys.ENTER);
//		searchfield.sendKeys("Shoes"+Keys.BACK_SPACE);
		searchfield.sendKeys("pencil"+Keys.ARROW_DOWN);
		searchfield.sendKeys(Keys.ENTER);
		
//		searchfield.sendKeys("Shoes");
//		searchfield.sendKeys(Keys.chord(Keys.CONTROL,"A"));
//		searchfield.sendKeys(Keys.BACK_SPACE);
	}

}
