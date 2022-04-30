package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//select[@id='input-country']")).sendKeys("Angola");
		driver.manage().window().maximize();
		//driver.close();

	}

}
