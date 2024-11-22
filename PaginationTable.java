package HandlingWebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com");
driver.manage().window().maximize();
int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
System.out.println(noOfRows);
for(int page=1;page<=4;page++) {
	if(page>1) {
		driver.findElement(By.xpath("//ul[@id='pagination']//li["+page+"]")).click();
for(int i=1;i<=noOfRows;i++) {
	String value=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]")).getText();
List<WebElement> elements=driver.findElements(By.xpath("//table[@id='productTable']//td[4]//input"));
for(WebElement it:elements) {
	it.click();
}
System.out.println(value);
}}}
/*for(int i=1;i<=noOfRows;i++) {
	String Price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]/td[3]")).getText();
System.out.println(Price);
}*/
	
	}

}
