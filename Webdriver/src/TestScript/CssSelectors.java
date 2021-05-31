package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

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
		//		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("send values"); 
		//		driver.findElement(By.cssSelector("input[id='login1'][name='login']")).sendKeys("send values"); //taking two xpaths to locate
			//	driver.findElement(By.cssSelector("#login1")).sendKeys("send values"); //shortcuts css finder
				
			//	driver.findElement(By.cssSelector("#div.table div #login1")).sendKeys("send values"); //shortcuts of selecting classes
			//	driver.findElement(By.cssSelector("input[id^='logi']")).sendKeys("send values"); //css stats with
				driver.findElement(By.cssSelector("input[id*='logi']")).sendKeys("send values"); //css contains
				

				
				




	}

}
