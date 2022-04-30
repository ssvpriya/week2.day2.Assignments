package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("(//h5[contains(text(),'Button')])[1]")).click();
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println(location);
		String cssValue = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println(cssValue);
		String color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("color");
		System.out.println(color);
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println(size);
		

	}

}
