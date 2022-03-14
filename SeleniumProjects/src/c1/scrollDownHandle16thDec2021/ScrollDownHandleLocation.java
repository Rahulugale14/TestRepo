package c1.scrollDownHandle16thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownHandleLocation {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.daad.de/en/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class = 'snoop-button qa-cookie"
				+ "-consent-accept-all  snoop-button--primary']")).click();
		Thread.sleep(3000);

		/*WebElement str = driver.findElement(By.xpath("(//a[@class = 'teaser-card__link u-posit"
												+ "ion-relative link link--nowrap'])[1]"));
		Point loc = str.getLocation();
		System.out.println(loc);
		*/
		
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0, 700)");
		Thread.sleep(3000);

		driver.quit();
		
	}
	
}
