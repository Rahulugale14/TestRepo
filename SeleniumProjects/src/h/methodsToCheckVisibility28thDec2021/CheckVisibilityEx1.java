package h.methodsToCheckVisibility28thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityEx1 {

	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www2.daad.de/deutschland/studienangebote/international-programmes/en/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@id = 'suggest']"));
		boolean b = ele.isDisplayed();
		System.out.println(b);
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		
		driver.quit();
		
		
	}
	
	
}
