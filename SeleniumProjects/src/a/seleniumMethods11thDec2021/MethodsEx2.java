package a.seleniumMethods11thDec2021;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsEx2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/");
	
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());
		
		driver.quit();      					// it closes all the tab
		
	}

}
