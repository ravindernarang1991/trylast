import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsDisplayed {
	
	public static void main(String args[]){
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("http://app.crewfire.com/login");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		WebElement ErrorMSG= driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		//System.out.println(ErrorMSG.isDisplayed());
		//2nd way
if(ErrorMSG.isDisplayed())
{
	System.out.println("Validation is coming");//try to find out this line in github
	
}else
{
	System.out.println("Validation is not coming");

}
	}

}
