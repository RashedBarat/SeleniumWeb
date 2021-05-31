package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Sibling_Following {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.w3schools.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[text()='Learn CSS']/preceding-sibling::a")).click();
		// used to click the upper one [[[[if their was 2 properties before this then need to use a[1],a[2] depending on the index number
	
		//driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[text()='Learn CSS']/following-sibling::a[1]")).click();
		// used to click the immediate down one 
		
		
		//driver.findElement(By.xpath("//*[@id='mySidenav']/div/a[text()='Learn CSS']/parent::div/parent::nav/parent::body/div[6]/div[1]/div[1]/a[text()='LEARN HTML']")).click();
		//switching between tabs/elements
		
		//driver.findElement(By.xpath(".//*[@id='mySidenav']/div/a[text()='Learn CSS']/parent::div/parent::nav/following-sibling::div[2]/div[1]/div[1]/a[1]")).click();
		//switching between parents and siblings
	


	}

}
