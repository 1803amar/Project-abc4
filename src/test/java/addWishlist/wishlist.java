package addWishlist;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class wishlist {
	public String baseUrl = "https://www.myntra.com/" ;
	public WebDriver driver;
	
	@BeforeTest
	public void setup() 
	{
		System.out.println("Before test exicuted");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}

	@Test
	public void test1() 
	{
		driver.findElement(By.xpath(baseUrl));
	}
	@AfterTest
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
	