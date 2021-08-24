package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");			
		
		//Go to Home Page
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[1]")).click();
		driver.navigate().back();		
	
		//Find where am supposed to go without clicking me?
		String link = driver.findElement(By.xpath("//a[contains (text(),'without clicking')]")).getAttribute("href");
	    System.out.println("Hidden links is " +link); 
		
		//Go to Home Page (Interact with same link name)
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[2]")).click();	
		driver.navigate().back();	
		
		//Number of links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		System.out.println("The number of links on this page "+links.size());
		
	
	    
	   }
}
