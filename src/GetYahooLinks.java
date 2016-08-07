import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetYahooLinks {
	
	public static WebDriver driver;	
	public static void main(String args[]) {
		//WebDriver driver;
	String URL = "http://www.marutisuzuki.com/";
		//System.out.println("Path is " +System.getProperty("user.dir"));
		 //System.out.println(System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(URL);
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.print(links.size());
		
		for(WebElement i:links){
			
			String hyperlink = i.getText();
			
			System.out.println(hyperlink);
			System.out.println(i.getAttribute("href"));
		}
		
		
	}
}
