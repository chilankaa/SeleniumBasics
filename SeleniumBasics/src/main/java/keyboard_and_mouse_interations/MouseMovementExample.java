package keyboard_and_mouse_interations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement mail=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		WebElement google=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-google']"));
//		System.out.println(mail.getAttribute("title"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mail).build().perform();
		actions.moveToElement(google, 5, 6).build().perform();
	}

}
