package webdrivermethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandles {

	public static void main(String[] args) {
		//approach 1 using arraylist conversion from set
/*WebDriver driver=new ChromeDriver();
driver.get("https://sampadakore18-trials713.orangehrmlive.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String>WindowIds=driver.getWindowHandles();
System.out.println(WindowIds);
List<String> WindowId=new ArrayList(WindowIds);
String ParentId=WindowId.get(0);
String ChildId=WindowId.get(1);
System.out.println(driver.getTitle());
driver.switchTo().window(ChildId);
System.out.println(driver.getTitle());
driver.switchTo().window(ParentId);
System.out.println(driver.getTitle());
*/
		//approach 2 using looping statement
		WebDriver driver=new ChromeDriver();
		driver.get("https://sampadakore18-trials713.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> WindowIds=driver.getWindowHandles();
		/*for(String winid:WindowIds) {
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}*/
		
		}
	}


