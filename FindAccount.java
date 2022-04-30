package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		driver.findElement(By.linkText("Credit Limited Account")).click();
		driver.findElement(By.linkText("Edit")).click();
		String attribute = driver.findElement(By.xpath("//input[@id='accountName']")).getAttribute("value");
		String text = driver.findElement(By.xpath("//textarea[@name='description']")).getText();
		System.out.println(attribute);
		System.out.println(text);
		driver.close();
		
	}

}
