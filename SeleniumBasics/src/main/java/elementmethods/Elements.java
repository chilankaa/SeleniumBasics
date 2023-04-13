package elementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/index.php");
		WebElement table=driver.findElement(By.xpath("//ul[@class='navbar-nav']//li[4]//a"));
		System.out.println(table.getText());
		List<WebElement> headers=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		System.out.println(headers.size());
//		for(int i=0;i<headers.size();i++) {
//			System.out.println(headers.get(i).getText());
//		}
		for(WebElement elements:headers) {
			System.out.println(elements.getText());
		}
	}

}
