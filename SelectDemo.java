package HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement ele1=driver.findElement(By.xpath("//select[@id='country']"));
Select ele2=new Select(ele1);
//ele2.selectByVisibleText("Germany");
//ele2.selectByIndex(5);
List<WebElement> e =ele2.getOptions();
System.out.println(e.size());
/*for(int i=0;i<e.size();i++) {
	System.out.println(e.get(i).getText());
}*/
for(WebElement w:e) {
	System.out.println(w.getText());
}
	}

}
