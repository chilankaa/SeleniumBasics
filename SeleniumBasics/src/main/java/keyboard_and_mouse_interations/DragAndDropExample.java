package keyboard_and_mouse_interations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement source1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[8]"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
//		actions.dragAndDrop(source1, destination);
	}

}
