package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class Assignment24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(" https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option"));
		int size=options.size();
		for (int i = 0; i < size ; i++) {
			options.get(0).click();
			options = driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option"));
		}
//		driver.quit();
	}

}
