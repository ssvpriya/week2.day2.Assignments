package week2.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		//known-languages
		driver.findElement(By.xpath("(//label[@for='java']//following-sibling::input)[3]")).click();
		driver.findElement(By.xpath("(//label[@for='java']//following-sibling::input)[5]")).click();
		
		//verify checkbox selected
		boolean selected = driver.findElement(By.xpath("//label[contains(text(),'Selenium')]/following-sibling::input")).isSelected();
		
		if(selected)
		{
			System.out.println("Check box is ON");
		}
		else {
			System.out.println("Check Box is OFF");
		}
		
		//deselect the check box
		driver.findElement(By.xpath("(//label[contains(text(),'DeSelect')]/following-sibling::input)[2]")).click();
		
	    List <WebElement> AllCheckboxes =  driver.findElements(By.xpath("//label[contains(text(),'Select all')]/following-sibling::input"));
	    
	    int size = AllCheckboxes.size();
	    System.out.println(size);
		
	    for(int i = 0; i<size; i++) {
	        
	        AllCheckboxes.get(i).click();
	        
	    }

	}

}
