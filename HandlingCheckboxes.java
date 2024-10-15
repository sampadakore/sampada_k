package Checkboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
List<WebElement> elements=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
/*for(WebElement ele:elements) {
	ele.click();
}*/
/*for(int i=4;i<elements.size();i++) {
	elements.get(i).click();
}
for(int i=0;i<elements.size();i++) {
	if(elements.get(i).isSelected()) {
		elements.get(i).click();
	}
}*/
driver.findElement(By.xpath("//input[@id='male']")).click();
boolean male_status=driver.findElement(By.xpath("//input[@id='male']")).isSelected();
	System.out.println(male_status);
	}

}
