package dropdownCountry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownCountry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari.subramani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(1000);			
			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

			
		}

	}

}
