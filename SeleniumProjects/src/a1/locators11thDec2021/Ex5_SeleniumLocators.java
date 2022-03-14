package a1.locators11thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys("Captain America");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id ='search-icon-legacy']")).click();
	Thread.sleep(3000);
	
	/*driver.findElement((By.xpath("//yt-icon[@class='style-scope ytd-"
			+ "notification-topbar-button-renderer'][1]"))).click();
	Thread.sleep(3000);

	driver.findElement(By.className("style-scope ytd-button-renderer")).click();
	Thread.sleep(3000); 
	*/
	
	driver.quit();
	
	
		
		
		
		
		
		
		

	}

}
