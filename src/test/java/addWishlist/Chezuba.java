package addWishlist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Chezuba {
	
WebDriver driver ;
	
	
	@Test
	public void setupDriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
//		 open the web page 
		 driver.get("https://www.amazon.in/");
		 
		
	}
	
	
	@Test
	public void test01() throws InterruptedException {
		 
//		get the search bar
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement search =   driver.findElement(By.cssSelector("#twotabsearchtextbox")); 
//    enter the keyword for search like "laptop"
    search.sendKeys("laptops");
    
    
//    Click the search button and then results are on the screen
    WebElement searchicon =   driver.findElement(By.cssSelector("#nav-search-submit-button")); 
    searchicon.click();
	}
	

}
