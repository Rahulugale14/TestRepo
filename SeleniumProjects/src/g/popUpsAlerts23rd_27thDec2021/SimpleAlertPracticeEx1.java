package g.popUpsAlerts23rd_27thDec2021;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertPracticeEx1 {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id = 'alertButton']")).click();
		Thread.sleep(3000);
		Alert rdx = driver.switchTo().alert();
		System.out.println(rdx.getText());
		rdx.accept();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
