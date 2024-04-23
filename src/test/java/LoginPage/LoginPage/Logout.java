package LoginPage.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaval\\Desktop\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://parabank.parasoft.com//");
		driver.findElement(By.partialLinkText ("Register")).click();
		driver.findElement(By.name ("customer.firstName")).sendKeys("subbarao");
		driver.findElement(By.name ("customer.lastName")).sendKeys("digumarthi");
		driver.findElement(By.name ("customer.address.street")).sendKeys("kambhampadu");
		 driver.findElement(By.xpath("//input[@name='customer.address.city']")).sendKeys("guntur");
		 driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("Andhra Pradesh");
		 driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("500048");
		 driver.findElement(By.name ("customer.phoneNumber")).sendKeys("9989568271");
		
		 driver.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("123d");
		 driver.findElement(By.cssSelector("input[name='customer.username']")).sendKeys("123d");
		 driver.findElement(By.cssSelector("input[id='customer.password']")).sendKeys("subbu1995");
		 
		
		
	}

}
