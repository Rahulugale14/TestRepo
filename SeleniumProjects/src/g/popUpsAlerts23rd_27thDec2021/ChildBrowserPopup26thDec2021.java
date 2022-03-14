package g.popUpsAlerts23rd_27thDec2021;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup26thDec2021 {

public static void main (String [] args)  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");   
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text() = 'Jobs']")).click();
		driver.findElement(By.xpath("//div[text() = 'Recruiters']")).click();
		driver.findElement(By.xpath("//div[text() = 'Companies']")).click();
		
		Set<String> ids = driver.getWindowHandles(); 		// In Set, ids doesn't store on basis of Index Values
		System.out.println(ids.size());
		
		ArrayList a = new ArrayList(ids);									// ArrayList stores value on basis of Index Values
		
		System.out.println(a.get(0));
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println(a.get(1));
		driver.switchTo().window((String) a.get(1)); 								// Control changing statement
		String childTitle1 = driver.getTitle();
		System.out.println(childTitle1);
		// driver.close();
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println(a.get(2));
		driver.switchTo().window((String) a.get(2));
		String childTitle2 = driver.getTitle();
		System.out.println(childTitle2);
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println(a.get(3));
		driver.switchTo().window((String) a.get(3));
		String childTitle3 = driver.getTitle();
		System.out.println(childTitle3);

		

	}
}
