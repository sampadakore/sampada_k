package webdrivermethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificBrowserWindow {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://sampadakore18-trials713.orangehrmlive.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> winId=driver.getWindowHandles();
for(String id:winId) {
	String title=driver.switchTo().window(id).getTitle();
	System.out.println(title);
	if(title.equals("Human Resources Management Software | OrangeHRM"))
	{
		driver.close();
	}
}
	}

}
