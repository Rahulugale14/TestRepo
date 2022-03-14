package c.screenShotHandle16thDec2021;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
															// Date: 16th Dec 2021
public class ScreenshotHandle16thDec2021 {	

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			// takes SS
		File des = new File("C:\\Users\\admin\\eclipse-workspace\\"						// to store SS
				+ "SeleniumProjects\\src\\seleniumPrograms\\FirstPage.png");
		FileHandler.copy(src, des);
		
		
	}
}
