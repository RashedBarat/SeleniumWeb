package TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				// driver.get("https://jqueryui.com/draggable/");
				//   driver.get("https://jqueryui.com/droppable/");
				driver.get("https://jqueryui.com/slider/");
		
				 
				 
				 
				driver.manage().window().maximize(); // to maximize the window
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				
				List<WebElement> list = driver.findElements(By.tagName("iframe"));
				
				System.out.println(list.size());
				System.out.println();
				
				
				driver.switchTo().frame(0);
				
			/*	WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
				
				System.out.println(drag.getText());    				||| Method to DRAG to one place to another

				Actions action = new Actions(driver); 
				
				action.moveToElement(drag).dragAndDropBy(drag,50,50).build().perform();*/

				
			
				
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
			/*	WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
				WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
				
				Actions action = new Actions(driver);					//||| Method to DRAG and DROP to one place to another

					
				action.moveToElement(drag).dragAndDrop(drag, drop).build().perform();  */
								
	//////////////////////////////////////////////		/////////////////////////////////////////////
				
				
				
				Actions action = new Actions(driver);					//||| Method to SLIDE to one place to another

				WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
				
				action.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
				
				Actions action2 = new Actions(driver);		
				
				action2.moveToElement(slider).dragAndDropBy(slider, 100, 0).build().perform();
				
				
				//////////////////////////////////////////////		/////////////////////////////////////////////

			
				//iFrame drag and drop, resize, slider, move||||| these are Udemy lecture 31 - 38
			
				
	}

}
