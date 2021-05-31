import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.navigate().to("https://ufile.io/");
				driver.manage().window().maximize(); // to maximize the window
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
			//	driver.findElement(By.xpath("//*[@id='upload-window']/div")).sendKeys("C://Users//Akitarabita//Desktop//WebDriver//test uploader//test.txt"); 
				//method1: selects the text file [Easy straight forward way which will not work most of the time]
				
				//Method2: donwload Autoit and autoit editor and do the uploading
				//can watch youtube videos how to do it or udemy lecture: 44
				
	
	}

}
