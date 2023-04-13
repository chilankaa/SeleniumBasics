package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectAnotherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String state="Indiana";
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		WebElement dropdownfield=driver.findElement(By.xpath("//span[text()='Alaska']"));
		dropdownfield.click();
		WebElement statesinputfield=driver.findElement(By.xpath("//input[@tabindex='0']"));
		statesinputfield.sendKeys(state);
		WebElement states=driver.findElement(By.xpath("//li[text()='"+state+"']"));
		states.click();
		
	}

}
