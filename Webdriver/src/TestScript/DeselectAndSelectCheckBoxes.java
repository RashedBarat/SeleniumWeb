package TestScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeselectAndSelectCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//lib//chromedriver.exe");
						// Instantiating driver object and launching browser
						WebDriver driver;

						//driver = new FirefoxDriver(); //creating an element of firefox
						 driver = new ChromeDriver();

						driver.navigate().to("http://www.tizag.com/htmlT/htmlcheckboxes.php");
						driver.manage().window().maximize(); // to maximize the window
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						
						List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class='display']//input[@name='sports']"));
						
				/*		 Select checkboxx = new Select ((WebElement) driver.findElements(By.xpath("//div[@class='display']//input[@name='sports']")));
						  
						 checkboxx.deselectAll();*/
								
						 for(WebElement e: checkbox){
																					
							if(e.isSelected() == true ){							
								e.click();
							}
								
								System.out.println(e.isSelected());
								System.out.println(e.getAttribute("value"));
								
								System.out.println("------------------");
								
								
								if(e.getAttribute("value").equals("football")||e.getAttribute("value").equals("basketball")){
									e.click();
							
							}
						 }
		}
						 

	}


