package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		WebElement mail=driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		String tooltip=mail.getAttribute("title");
		System.out.println(tooltip);
	}

}
