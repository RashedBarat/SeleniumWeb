import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				 driver.get("http://www.rediff.com/news");
				driver.manage().window().maximize(); // to maximize the window
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
				// This waits for the whole code element for 5 seconds until find the element
				
				
				driver.findElement(By.xpath("//p[@id='signin_info']/a[@title='Already a user? Sign in']")).click();
				
				driver.findElement(By.cssSelector("input[id*='logi']")).sendKeys("appautomator@rediffmail.com"); 			
				         //css contains [amar iccha chayle xpath o use korte partam
				
				driver.findElement(By.xpath("//div[@class='cell']//input[@id='password']")).sendKeys(Password.getencodedPassword());
				
		/*		I will get this password from another class named Password*/
				
				
				
				//u can use thread to wait to click on this for some seconds

				
				driver.findElement(By.xpath("//div[@class='cell']//input[@class='signinbtn']")).click();
				
				
			
			
	}

}
