package TestScript;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicExpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.navigate().to("http://www.yahoo.com/");
				driver.manage().window().maximize(); // to maximize the window
			//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//*[@id='ybar-sbq']")).sendKeys("Selenium");
				Thread.sleep(2000);
			
				/****** this is one style to do the searching ********/ 
			//	driver.findElement(By.xpath("//*[@id='ybar-sf']/div/div/div/ul/li[starts-with(@data,'selenium bene')]")).click();
	
				
				/****** this is another style to do the searching ********/ 

				List<WebElement> list = driver.findElements(By.xpath("//*[@id='ybar-sf']/div/div/div/ul/li[starts-with(@data,'selenium')]"));
				///////////findElementsssssssss

				System.out.print(list.size());
				
				list.get(0).click();
	}

}
