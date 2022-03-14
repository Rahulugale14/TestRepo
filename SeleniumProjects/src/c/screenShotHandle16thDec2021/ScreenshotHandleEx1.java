package c.screenShotHandle16thDec2021;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotHandleEx1 {

	public static void main (String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\admin\\eclipse-workspace\\SeleniumProjects\\src\\seleniumPrograms\\SecondPage.png");
		FileHandler.copy(src, des);
	
	}
}
