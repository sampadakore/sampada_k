package HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDropDowns {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement ele=driver.findElement(By.xpath("//select[@id='country-list']"));
Select it=new Select(ele);
List<WebElement> e=it.getOptions();
System.out.println("total no of options are"+e.size());
for(WebElement i:e) {
	System.out.println(i.getText());
}
it.selectByVisibleText("Brazil");

	
	}

}
