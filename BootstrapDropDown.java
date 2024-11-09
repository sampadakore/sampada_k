package HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
List<WebElement> e=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
System.out.println(e.size());
for(WebElement e1:e) {
	if(e1.getText().equals("Python") || e1.getText().equals("Oracle")){
	e1.click();	
	};
}
	
	}

}
