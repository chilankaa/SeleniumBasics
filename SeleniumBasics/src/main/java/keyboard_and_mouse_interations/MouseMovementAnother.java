package keyboard_and_mouse_interations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		WebElement edit=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		Actions action=new Actions(driver);
		action.contextClick(right_click).build().perform();
		action.moveToElement(edit).click().build().perform();
		driver.switchTo().alert().accept();
	}

}
