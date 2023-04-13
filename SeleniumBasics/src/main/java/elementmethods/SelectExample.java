package elementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select alldropdown=new Select(all);
		alldropdown.selectByIndex(3);
		alldropdown.selectByValue("search-alias=amazon-pharmacy");
		alldropdown.selectByVisibleText("Appliances");
		List<WebElement> options=alldropdown.getOptions();
		for(WebElement value:options) {
			System.out.println(value.getText());
		}
	}

}
