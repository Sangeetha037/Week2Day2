package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

		// Clicking on home page button
		//driver.findElement(By.xpath("//button[@id='home']")).click();

		// Get Position (X axis and Y axis)
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println("Get Position value is " + location);

		// Get Colour
		String colorname = driver.findElement(By.xpath("//button[@id='color']")).getAttribute("style");
		System.out.println(colorname);

		//Get Size (Height & Width)
		Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
		System.out.println("The height and width of the field is " + size);
	}

}