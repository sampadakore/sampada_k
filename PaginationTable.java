package HandlingWebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com");
driver.manage().window().maximize();
int noOfRows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
System.out.println(noOfRows);
/*for(int i=1;i<=noOfRows;i++) {
	String value=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]")).getText();
System.out.println(value);
}*/
for(int i=1;i<=noOfRows;i++) {
	String Price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+i+"]/td[3]")).getText();
System.out.println(Price);
}
	
	}

}
