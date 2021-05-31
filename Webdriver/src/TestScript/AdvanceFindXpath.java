package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceFindXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@id='navbtn_tutorials']")).click();
		//driver.findElement(By.xpath("//a[starts-with(@id,'navbtn_tut')]")).click();
		//driver.findElement(By.xpath("//a[contains(@id,'navbtn_t')]")).click();
		//driver.findElement(By.xpath("//a[contains(@id,'navbtn_t')]")).click();
		
		//driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/a)[last()]")).click(); //click the second a in the container
		
		

	}

}
