import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepaheadTimesjob {

	static public WebDriver driver;
	
	public static void main(String args[]){
		
		String URL = "http://stepahead.timesjobs.com/";
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\ChromeDriver.exe");
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='login_lnk']")).click();
		driver.findElement(By.xpath("//div[@class='home_midAlign login_lnk']")).click(); /// how this works
		
		driver.findElement(By.xpath("//input[@value='Register Now']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ravinder");
		driver.findElement(By.xpath("//input[@id='emailAdd']")).sendKeys("ravinder124124@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nokia3110");
		driver.findElement(By.cssSelector("input[id='retypePassword']")).sendKeys("nokia3110");
		driver.findElement(By.cssSelector("input[id='mobNumber']")).sendKeys("9810444578");
		
		WebElement checkboxvalidation = driver.findElement(By.xpath("//input[starts-with(@name,'termsOfUseStatus')]"));
		driver.findElement(By.xpath("//a[@class='disclaimer_close fr']")).click(); /// unknown error: Element is not clickable at point (913, 642)
		
		if(checkboxvalidation.getAttribute("checked") != null){    				// it checks if checkbox checked or not
			driver.findElement(By.xpath("//input[@value='Register Now']")).click();
		}
		
		else {
			driver.findElement(By.xpath("//input[starts-with(@name,'termsOfUseStatus')]")).click();
		}
		driver.navigate().to("http://stepahead.timesjobs.com/get-referred-today");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='addCartBtn' and @class='button fnt18 blue mrgn_t20']")).click();
		driver.findElement(By.xpath("//a[@id='proceedMisSelling']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[@id='lc_minimize']")).click();
		//driver.findElement(By.xpath("//div[@id='engTxt']")).click(); //// and how it is not working
		
		//driver.findElement(By.xpath("//span[@id='lc_chat_title']")).click();
		
		driver.findElement(By.xpath("//a[@id='proceedMisSelling']")).click();
		try {
			   // thread to sleep for 1000 milliseconds
			   Thread.sleep(10000);
			   } catch (Exception e) {
			   System.out.println(e);
			   }
		driver.navigate().refresh();
		
		try {
			   // thread to sleep for 1000 milliseconds
			   Thread.sleep(10000);
			   } catch (Exception e) {
			   System.out.println(e);
			   }
		driver.findElement(By.xpath("//a[@id='proceedMisSelling']")).click();
		
		WebElement kumar= driver.findElement(By.xpath("//div[@id='GB_overlay']"));
		System.out.print(kumar);
		
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/ul/li[1]/label")).click();
		//.findElement(By.cssSelector("html body.composePane div.langOuter div.langInner div.langMainWrap div.langPaneDesc.clearfix div#engTxt.langList ul li label.chk-bx.chk-bx-checked")).click();
		driver.findElement(By.cssSelector("html body.composePane div.langOuter div.langInner div.langMainWrap div.langPaneDesc.clearfix div#engTxt.langList ul li label.chk-bx")).click();
		driver.findElement(By.xpath("//*[contains(text(), 'I have not shared / been asked to share my TimesJobs / Step Ahead')]//label")).click();
	driver.findElement(By.xpath("//*[contains(text(), 'Job seekers benefit from our services but the purchase of any service')]//label")).click();
	driver.findElement(By.xpath("//*[contains(text(), 'For direct cash transfer, only use our bank account name (payable')]//label")).click();
}
}