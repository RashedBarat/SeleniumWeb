package TestScript;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.navigate().to("http://www.echoecho.com/htmlforms10.htm");
				driver.manage().window().maximize(); // to maximize the window
			//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				
				List<WebElement> list = driver.findElements(By.xpath(".//input[@name='group1']"));
				
				System.out.println(list.size());

				for(WebElement e: list){
										
					System.out.println(e.getAttribute("value"));
					System.out.println(e.isSelected());
					
					if(e.getAttribute("value").equals("Cheese")){
						e.click();
					}


				}
				

	}

}
