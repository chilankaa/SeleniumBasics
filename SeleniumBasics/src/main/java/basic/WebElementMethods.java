package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox1=driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		
	    //isSelected
		System.out.println(checkbox1.isSelected());
		WebElement checkbox2=driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
		checkbox2.click();
		System.out.println(checkbox2.isSelected());
		
		if(!checkbox1.isSelected()) {
			checkbox1.click();
		}
		if(!checkbox2.isSelected()) {
			checkbox2.click();
		}
		
		//isDisplayed
		System.out.println(checkbox1.isDisplayed());
		
		//isEnabled
		System.out.println(checkbox1.isEnabled());
	}

}
