package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static WebDriver driver;
	public static void main(String[] args) {		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
           driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
	System.out.println(driver.getTitle());
	
	driver.findElement(By.name("q")).sendKeys("testing");
	
	List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[3]//span"));
	
	
	
	System.out.println(list.size());
	
	for (WebElement ele : list)
	{
		
		String innerHTML =ele.getText();
		System.out.println("Values from drop down is "+innerHTML);
	
		
           if (innerHTML.equals("testing techniques"))
           {
		ele.click();
		break;
           }
	}
	
		
		List <WebElement> allinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allinks.size());
		
		for (WebElement link:allinks)

		{
			
			if (link.getText().equalsIgnoreCase("Types of Software Testing: Different Testing Types with Details"))
			{
				link.click();
				break;
			}
			
			
			
		}
			
				driver.quit();

	}
	


}
