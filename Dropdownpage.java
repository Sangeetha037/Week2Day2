package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		// Selecting index 4 in the drop down
		WebElement Drpdown = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drop1 = new Select(Drpdown);		
		drop1.selectByIndex(4);

		// selecting dropdown using by visible text, UFT/QTP
		WebElement drpdwn2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drop2 = new Select(drpdwn2);
		drop2.selectByVisibleText("UFT/QTP");

		//Selecting dropdown using value, Selenium
		WebElement drpdwn3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
			Select drop3 = new Select(drpdwn3);
			drop3.selectByValue("1");
			
			//Find the number of drop down values available in the drop down
			WebElement drop4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
			Select dpDw4 = new Select(drop4);
			int i = dpDw4.getOptions().size();
			System.out.println("Number of drop down values available are  "+i);
			
			//You can also use sendKeys to select
			driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/..")).sendKeys("Appium");			
			
			//Select your programs
			driver.findElement(By.xpath("//option[text()='Select your programs']/..")).sendKeys("Loadrunner");
			
	}

}
