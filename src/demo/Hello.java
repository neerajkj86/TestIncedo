package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

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
	
	List <WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li/div/div/descendant::span"));
	
	System.out.println(list.size());
	
	for (WebElement ele : list)
	{
		System.out.println(ele.getText());
	}
	
		driver.quit();
		

	}

}
