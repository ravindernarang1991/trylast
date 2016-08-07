

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


public class GoogleDropDown {


public static WebDriver driver;

public static void main(String args[]){
	
	String URL = "https://accounts.google.com/SignUp"; 
	
	/*System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"\\IEDriverServer.exe");
	
	driver = new InternetExplorerDriver();*/
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//List<WebElement> Radiobtn = driver.findElement(By.name(name))
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ravinder");
	
	//List<WebElement> dropdownlist1 =driver.findElements(By.tagName("div"));
	
	driver.findElement(By.xpath("//div[@id='CountryCode']")).click();
	List<WebElement> dropdownlist1 = driver.findElements(By.cssSelector("div[id='CountryCode'] div[class='goog-menuitem']"));
	
	System.out.println(dropdownlist1.size());
	
	System.out.print("My Countries are:");
	
	for(WebElement i: dropdownlist1){
		
		String j = i.getText();
		//String country = i.getText();
		
		System.out.println(j);
	}
	//System.out.println(dropdownlist1);
	//System.out.println(dropdownlist1.size());
	}}

	
