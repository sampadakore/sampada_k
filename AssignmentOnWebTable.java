package HandlingWebTables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class AssignmentOnWebTable {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://blazedemo.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement ele=driver.findElement(By.xpath("//select[@name='fromPort']"));
Select el=new Select(ele);
el.selectByValue("Boston");
WebElement ele2=driver.findElement(By.xpath("//select[@name='toPort']"));
Select el2=new Select(ele2);
el2.selectByValue("London");
driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
List<WebElement> elements=driver.findElements(By.xpath("//table[@class='table']//tr//td[6]"));
	for(int i=0;i<elements.size();i++) {
	String a=	elements.get(i).getText();
	System.out.println(a);
	ArrayList<String> arr=new ArrayList<String>();
	arr.add(a);
	Collections.sort(arr);
	System.out.println(arr);
	}
	
	
	}
}


	


