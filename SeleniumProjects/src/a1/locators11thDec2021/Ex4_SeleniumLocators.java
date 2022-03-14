package a1.locators11thDec2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www2.daad.de/deutschland/studienangebote/international-programmes/en/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"search-form-homepage\"]/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/fieldset/div/button")).click();
		Thread.sleep(3000);
		
		WebElement select1 = driver.findElement(By.xpath("//button[@title = 'Please select'][1]"));
		Select s1 = new Select(select1);
		s1.selectByVisibleText("Prep course");
		Thread.sleep(3000);
		

	
	}

}
