package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.w3schools.com/");
		driver.manage().window().maximize();
		
		
		
	/*	to search something 
		1. .//*[@class='xyz'] 
		2. .//*[@id='xyz']
		3. .//*[@name="search"]
		*/
		
///////////////////////////////////////////////////////////////////////////////////////////	
		//driver.findElement(By.className("w3-bar-item w3-button")).click();
		//driver.findElement(By.xpath("html/body/div[4]/div/a[1]/i")).click();
		//driver.findElement(By.id("gsc-i-id1")).sendKeys("search by id");
		//driver.findElement(By.linkText("HTML REFERENCE")).click();
		//driver.findElement(By.name("search")).sendKeys("name");
		//driver.findElement(By.partialLinkText("HTML REFERENCE")).click();

//////////////////////////////////////////////////////////////////////////////////////////
/*		List<WebElement> list = driver.findElements(By.tagName("a"));   //here:  tagName can be className,id,linkText,name etc etc 
 * 																				findElementssssssssss
		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++){
			
			System.out.println(list.get(i).getText());
				if(list.get(i).getText().equals("Learn CSS")){
					list.get(i).click();
					
					break;
				}
			
		}		*/	
///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
	}

}
