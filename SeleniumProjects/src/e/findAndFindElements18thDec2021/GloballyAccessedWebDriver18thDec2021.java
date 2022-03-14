package e.findAndFindElements18thDec2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GloballyAccessedWebDriver18thDec2021 {
	
	static WebDriver driver;																// globally accessed - try to run the program

	public static void main (String [] args) {
		
		/*System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		
	
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		*/
		// path for Microsoft edge ---- "E:\Selenium\msedgedriver.exe" 
		
		System.setProperty("webdriver.edge.driver", "E:\\Selenium\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		List<WebElement> rdx = driver.findElements(By.tagName("a"));
		System.out.println(rdx.size());
		
	}
}
