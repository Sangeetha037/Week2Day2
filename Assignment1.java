package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		// Entering value in Mail id text field
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sangeetha.baskaran@yahoo.com");
		
		// Adding the word "Text" with the existing text.
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Text");
		
		// Getting the defulat text in the field
		String attribute = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println("The text found on the text box as " + attribute);
		
		// Clearing text in "Clear the text" field
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//Confirm that edit field is disabled
		String fieldValue = driver.findElement(By.xpath("//input[@disabled='true']")).getAttribute("disabled");	
		System.out.println(fieldValue);
		if (fieldValue.equals("true")) { 
		      System.out.println("The text field is disabled");
		} else {
			System.out.println("The text field is non disabled");
			
		}
	}
}

