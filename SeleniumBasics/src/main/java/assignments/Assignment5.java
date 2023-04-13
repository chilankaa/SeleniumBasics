package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		System.out.println("male radio button is selected? "+male.isSelected());
		WebElement female=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		female.click();
		System.out.println("female button is selected? "+female.isSelected());
		System.out.println("is female button is displayed? "+female.isDisplayed());
		System.out.println("is female button is enabled "+female.isEnabled());
		System.out.println("is male button is enabled "+male.isEnabled());
		
	}

}
