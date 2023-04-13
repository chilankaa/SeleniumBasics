package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement office=driver.findElement(By.xpath("//table//tbody//tr[6]//td[3]"));
		System.out.println(office.getText());
		System.out.println("----------------------------------------------------------");
		List<WebElement> employee_salary=driver.findElements(By.xpath("//table//tbody//tr//td[6]"));
		for(WebElement salary:employee_salary) {
			System.out.println(salary.getText());
		}
	}

}
