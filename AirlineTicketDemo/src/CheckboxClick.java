import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckboxClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hari.subramani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	   WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		//driver.findElement(By.id(null))
//	   Select dropdown= new Select(staticDropdown);
//	   
//	   dropdown.selectByIndex(3);
//	   System.out.println(dropdown.getFirstSelectedOption().getText());
	   
	   driver.findElement(By.id("divpaxinfo")).click();
for(int i=1;i<5;i++) 
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
//	  for(int i=1;i<3;i++) {
//		  driver.findElement(By.id("hrefIncChd")).click();
//	  }
	  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
}
}
