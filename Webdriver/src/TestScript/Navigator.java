package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.navigate().to("http://www.rediff.com/news");
				driver.manage().window().maximize(); // to maximize the window
				
				driver.findElement(By.xpath("//p[@id='signin_info']/a[@title='Already a user? Sign in']")).click();

				
				Thread.sleep(5000);
				
				driver.navigate().back();
				
				Thread.sleep(5000);
				
				driver.navigate().forward();
				
				Thread.sleep(5000);
				
				driver.navigate().refresh();
				
				

	}

}
