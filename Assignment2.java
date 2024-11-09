package HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement w=driver.findElement(By.xpath("//select[@id='colors']"));
Select i=new Select(w);
List <WebElement> li=i.getOptions();
System.out.println(li.size());
for(WebElement wk:li) {
System.out.println(wk.getText());	
}
	}

}
