package webdrivermethods;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
//open url on browser
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//search for selenium in search box
driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
driver.findElement(By.xpath("//input[@type='submit']")).click();
//getting xpath of all the sub elements
List<WebElement> ele=driver.findElements(By.xpath("//a[contains(text(),'Selenium')]"));
//click on each subelement on by one using for each loop
for(WebElement webele:ele) {
	webele.click();
	}
//getting id of each window
Set<String> Winid=driver.getWindowHandles();
System.out.println(Winid);
for(String win:Winid) {
	//focus browser on perticular window and get the title
	String title=driver.switchTo().window(win).getTitle();
	if(title.equals("Selenium in biology - Wikipedia")) {
		//close the browser having above title
		driver.close();
	}
}

	}

}

