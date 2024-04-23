package LoginPage.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaval\\Desktop\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//a[contains(@title, 'Login')]")).click();
		driver.findElement(By.xpath("//*[@class='r4vIwl BV+Dqf']")).sendKeys("9966583396");
		

	}

}
