import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFacebookDateDropdownInIE {
public static WebDriver driver;

public static void main(String args[]){
	
	String URL = "https://www.facebook.com/"; 
	
	/*System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") +"\\IEDriverServer.exe");
	
	driver = new InternetExplorerDriver();*/
	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get(URL);
	
	//List<WebElement> Radiobtn = driver.findElement(By.name(name))
	driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	driver.findElement(By.xpath("//input[@id='u_0_b']")).sendKeys("hunny");
	driver.findElement(By.xpath("//select[@id='day']/option[@value='2']")).click();
	
	//if(driver.findElement(By.xpath("//select[@id='day']")).isDisplayed()){
		
	
	List<WebElement> Radiobtn = driver.findElements(By.xpath("//select[@id='day']//option[@value]"));
	
	System.out.println(Radiobtn.size());
	
	/*Select abc= new Select(driver.findElement(By.xpath("//select[@id='day']")));
	
	List<WebElement>abd=abc.getOptions();*/
	for(WebElement R : Radiobtn){
		
		String Values = R.getText();
		System.out.print(Values);
		
	}
	
	List<WebElement> Radiobtn1 = driver.findElements(By.xpath("//select[@id='month']//option[@value]"));
	
	System.out.println(Radiobtn1.size());
	
	
	for(WebElement R : Radiobtn1){
		
		String ValuesMonth = R.getText();
		System.out.print(ValuesMonth);
		
	}
	
List<WebElement> Radiobtn2 = driver.findElements(By.xpath("//select[@id='year']//option[@value]"));
	
	System.out.println(Radiobtn2.size());
	
	
	for(WebElement R : Radiobtn2){
		
		String ValuesYear = R.getText();
		System.out.print(ValuesYear);
		
	}
	
	}
}
	

