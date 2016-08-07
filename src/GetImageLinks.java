import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetImageLinks {

	public static WebDriver driver;
	
	public static void main(String srgs[]){
		String URL = "http://www.marutisuzuki.com/";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(URL);
		
		List<WebElement> Image = driver.findElements(By.tagName("img"));
		System.out.println(Image.size());
		
		for(WebElement i : Image){
		
			String Source = i.getAttribute("src").toString();
			System.out.println(Source);
			System.out.println(i.getAttribute("alt").toString());
		}
	}
	
}
