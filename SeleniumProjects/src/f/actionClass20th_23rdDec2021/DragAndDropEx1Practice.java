package f.actionClass20th_23rdDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx1Practice {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		
		Actions rdx = new Actions(driver);
		rdx.dragAndDrop(drag, drop).perform();																//1st way
		// rdx.clickAndHold(drag).moveToElement(drop).release().build().perform();		//2nd way
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
}
