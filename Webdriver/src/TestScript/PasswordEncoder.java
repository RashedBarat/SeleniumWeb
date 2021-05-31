package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.get("http://www.rediff.com/news"); // calling the web site
				driver.manage().window().maximize(); // to maximize the window
				
				driver.findElement(By.xpath("//p[@id='signin_info']/a[@title='Already a user? Sign in']")).click();
				
				driver.findElement(By.cssSelector("input[id*='logi']")).sendKeys("appautomator@rediffmail.com"); 			
				         //css contains [amar iccha chayle xpath o use korte partam
				
				driver.findElement(By.xpath("//div[@class='cell']//input[@id='password']")).sendKeys(Password.getencodedPassword());
				
		/*		I will get this password from another class named Password*/
				
				driver.findElement(By.xpath("//div[@class='cell']//input[@class='signinbtn']")).click();;

	}

}
