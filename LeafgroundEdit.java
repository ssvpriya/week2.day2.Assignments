package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		String attribute = driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).getAttribute("value");
		System.out.println(attribute);
		System.out.println(driver.findElement(By.xpath("(//label[@for='email'])[1]")).getText());
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("123@gmail.com");
		System.out.println(driver.findElement(By.xpath("(//label[@for='email'])[2]")).getText());
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("(//label[@for=\"uname\"])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//label[@for=\"uname\"])[2]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div//input[@name='username'])[2]")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//label[@for='disabled']")).getText());
		String attribute2 = driver.findElement(By.xpath("//input[@disabled='true']")).getAttribute("background-color");
		System.out.println(attribute2);
		driver.close();

	}

}
