package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class NTCreateAccount {

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
		driver.findElement(By.linkText("Create Account")).click();
		Select se = new Select(driver.findElement(By.xpath("//select[@id='currencyUomId']")));
		se.selectByValue("AMD");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Tester123");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("2,00,000");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		

	}

}
