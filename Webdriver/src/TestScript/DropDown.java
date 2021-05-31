package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//lib//chromedriver.exe");
				// Instantiating driver object and launching browser
				WebDriver driver;

				//driver = new FirefoxDriver(); //creating an element of firefox
				 driver = new ChromeDriver();

				driver.navigate().to("http://www.rediff.com/news");
				driver.manage().window().maximize(); // to maximize the window
				
				driver.findElement(By.xpath("//p[@id='signin_info']/a[@title='Already a user? Sign in']")).click();
				
				driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/form/div[2]/div/a/u[text()='Create a new account']")).click();
				
				
				WebElement dropdown = driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));

				List<WebElement> list = dropdown.findElements(By.tagName("option"));
						
				System.out.println(list.size());
				
				for(int i=0; i<list.size();i++){
					
				String element  = list.get(i).getAttribute("value");
				
						if(element.equals("23")){
							list.get(i).click();
					
						}

	}

	}}
