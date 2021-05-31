package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGoogle {

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


	} 	 	

}
