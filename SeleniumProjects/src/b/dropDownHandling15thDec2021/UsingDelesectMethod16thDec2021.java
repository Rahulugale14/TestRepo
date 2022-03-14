package b.dropDownHandling15thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
																				//Date: 16th Dec 2021
public class UsingDelesectMethod16thDec2021 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//select[@id = 'cars']"));
		Select s = new Select(ele);
		s.selectByVisibleText("Audi");
		Thread.sleep(3000);

		s.deselectByVisibleText("Audi");
		Thread.sleep(3000);

		driver.quit();
		
	
	}
}
