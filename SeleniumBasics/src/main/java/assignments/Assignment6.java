package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		WebElement findus=driver.findElement(By.xpath("//a[contains(text(),'Like us On Facebook ')]"));
		System.out.println("Tooltip of find us is:- "+findus.getAttribute("title"));
		WebElement followall=driver.findElement(By.xpath("//a[text()='Follow All']"));
		System.out.println("Tooltip of follow all is:- "+followall.getAttribute("title"));
	}

}
