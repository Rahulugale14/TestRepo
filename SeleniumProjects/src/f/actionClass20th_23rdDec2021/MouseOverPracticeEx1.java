package f.actionClass20th_23rdDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverPracticeEx1 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		WebElement mouseOver = driver.findElement(By.xpath("(//a[text() = 'Support'])[1]"));
		Actions rdx = new Actions(driver);
		rdx.moveToElement(mouseOver).perform();
		Thread.sleep(3000);
		
		WebElement abc = driver.findElement(By.xpath("//a[text() = 'Stack Overflow']"));
		rdx.click(abc).perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
