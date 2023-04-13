package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		firstname.sendKeys("Chilanka");
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last name']"));
		lastname.sendKeys("Nath");
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("chilankanath");
		WebElement city=driver.findElement(By.xpath("//input[@placeholder='City']"));
		city.sendKeys("Alappuzha");
		WebElement state=driver.findElement(By.xpath("//input[@placeholder='State']"));
		state.sendKeys("Kerala");
		WebElement zip=driver.findElement(By.xpath("//input[@placeholder='Zip']"));
		zip.sendKeys("XXX");
		WebElement terms=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
		terms.click();
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		WebElement message=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(message.getText());
	}

}
