package f.actionClass20th_23rdDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop20thDec2021 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// https://www.globalsqa.com/demo-site/draganddrop/  ---- demo website
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id = 'droppable']"));
		
		Actions rdx = new Actions(driver);
		// rdx.dragAndDrop(drag, drop).perform();															//1st method to drag and drop
		rdx.clickAndHold(drag).moveToElement(drop).release().build().perform();			//2nd method to drag and drop
		
		driver.quit();
		
	}
	
}
