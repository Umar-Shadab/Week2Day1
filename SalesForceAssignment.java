package Week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByName("UserFirstName").sendKeys("Umar");
		driver.findElementByName("UserLastName").sendKeys("Shadab");
		driver.findElementByName("UserEmail").sendKeys("mohammedshadab41@gmail.com");
		WebElement drp1=driver.findElementByName("UserTitle");
		Select drpdwn1=new Select(drp1);
		drpdwn1.selectByValue("Sales_Manager_AP");
		driver.findElementByName("CompanyName").sendKeys("Testleaf");
		WebElement drp2=driver.findElementByName("CompanyEmployees");
		Select drpdwn2=new Select(drp2);
		drpdwn2.selectByValue("75");
		driver.findElementByName("UserPhone").sendKeys("1234567890");
		WebElement drp3=driver.findElementByName("CompanyCountry");
		Select drpdwn3=new Select(drp3);
		drpdwn3.selectByValue("IN");
		driver.findElementByClassName("checkbox-ui").click();
		driver.close();		
	}
}