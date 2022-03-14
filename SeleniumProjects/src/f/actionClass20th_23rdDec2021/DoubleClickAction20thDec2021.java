package f.actionClass20th_23rdDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction20thDec2021 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		WebElement dc = driver.findElement(By.xpath("(//a[text() = 'jQuery UI'])[2])"));
		Actions rdx = new Actions(driver);
		rdx.doubleClick(dc).perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
