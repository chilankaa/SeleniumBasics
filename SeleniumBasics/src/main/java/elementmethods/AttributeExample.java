package elementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AttributeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(searchfield.getAttribute("name"));
		System.out.println(searchfield.getAttribute("placeholder"));
		
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		String tooltipvalue=all.getAttribute("title");
		System.out.println(tooltipvalue);
		
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		String backgroundcolor=all.getCssValue("background-color");
		System.out.println(backgroundcolor);
		String color=searchbutton.getCssValue("color");
		System.out.println(color);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement search=driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		String backgroundcolor1=search.getCssValue("background-color");
		System.out.println(backgroundcolor);
				
		
	}

}
