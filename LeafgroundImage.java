package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[contains(text(),'Click on this image')]/following-sibling::img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//label[contains(text(),'Keyboard or Mouse')]/following-sibling::img")).click();
		driver.navigate().back();
		//finding broken image
		String attribute = driver.findElement(By.xpath("//label[contains(text(),'Am I Broken Image?')]/following-sibling::img")).getAttribute("onclick");
		if(attribute==null)
		{
			System.out.println("Image is broken");
		}
		else
			System.out.println("Image is editable");

	}

}
