package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOrQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.navigate().to("http://www.rediff.com/news");
				driver.manage().window().maximize(); // to maximize the window
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		
				driver.findElement(By.xpath("//p[@id='signin_info']/a[@title='Already a user? Sign in']")).click();
		        driver.close();
				//Closes the browser which is currently focused
			//	driver.quit();
				//Closes all the browsers opened by driver
				//Destroys the driver object

	}

}
