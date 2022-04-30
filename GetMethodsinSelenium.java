package week2.day3.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethodsinSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Title of Page"+title);
		if(title.contains("TestLeaf"))
		{
			System.out.println("Title matches with TestLeaf");
		}
		else
			System.out.println("Title is not matches with TestLeaf");
		System.out.println("The Current URL "+driver.getCurrentUrl());
		System.out.println("Source page is "+driver.getPageSource());
		driver.close();

	}

}
