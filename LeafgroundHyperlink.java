package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundHyperlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Find where am supposed")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();

	}

}
