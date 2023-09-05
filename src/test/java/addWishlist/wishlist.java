package addWishlist;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class wishlist {
	
WebDriver driver ;
	
	
	@Test
	public void setupDriver() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://wishbox2.vercel.app/creator/wishlists/66c71241-27cb-4b60-b9e3-543a9af534cc");
		 
		
	}
	
	
	@Test
	public void test01() throws InterruptedException {
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement phone =   driver.findElement(By.cssSelector("input[placeholder='1 (702) 123-4567']")); 
    phone.sendKeys("3333333333");
    
     driver.findElement(By.cssSelector("button[type='submit']")).click();;
     
     WebElement otp = driver.findElement(By.cssSelector("input[aria-label='Please enter verification code. Digit 1']"));
     otp.sendKeys("123456");
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     


		 	}
	
	
	@Test
	public void test02() throws InterruptedException {
		 
   driver.findElement(By.cssSelector("div[class='add-new-p-card flex-center-center text-center'] div")).click(); 
   
    WebElement name =  driver.findElement(By.cssSelector("input[placeholder='Wishlist Name']"));
    name.sendKeys("Wish1");
    
    WebElement discription = driver.findElement(By.cssSelector("#description"));
    discription.sendKeys("Hii! This is a demo wishlist discription");
    
    WebElement img = driver.findElement(By.cssSelector("#upload-cover-input"));
    img.sendKeys("\"C:\\Users\\Amar mishra\\Downloads\\AmarMishra_portfolio\\AmarMishra_Portfolio\\src\\assets\\bg-1.jpg\"");
    
    driver.findElement(By.cssSelector("button[type='submit']")).click();;
    
    


		 	}
	
	

}
