package elementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement startdate=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[5]"));
		System.out.println(startdate.getText());
		List<WebElement> headers=driver.findElements(By.xpath("//table//thead//tr[1]//th"));
		for(int i=0;i<headers.size();i++) {
			System.out.println(headers.get(i).getText());
		}
		WebElement name=driver.findElement(By.xpath("//table//tbody//tr[4]//td[1]"));
		System.out.println(name.getText());
		WebElement office=driver.findElement(By.xpath("//table//tbody//tr[4]//td[3]"));
		System.out.println(office.getText());
		List<WebElement> employee_name=driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		for(int i=0;i<employee_name.size();i++) {
		System.out.println(employee_name.get(i).getText());
		}
		List<WebElement> employee_details=driver.findElements(By.xpath("//table//tbody//tr[10]//td"));
		for(int i=0;i<employee_details.size();i++) {
		System.out.println(employee_details.get(i).getText());
		}
	}

}
