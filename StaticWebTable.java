package HandlingWebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//counting no. of row from table
List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));;
	System.out.println(rows.size());
//counting no of tables from table
int Ncol=	driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();
	System.out.println(Ncol);
	//read data from specific row and column
	String Authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
	System.out.println(Authorname);
	//read all the data from table
	/*for(int i=2;i<=rows.size();i++) {
		for(int j=1;j<=Ncol;j++) {
		String content=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
		System.out.print(content+"\t");
		}
		System.out.println();
	}*/
	/*for(int r=2;r<=rows.size();r++) {
		String auname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	if(auname.equals("Mukesh")) {
		String bname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	System.out.println(bname+" "+auname);
	}
	
	}*/
	int totalprice=0;
	for(int r=2;r<=rows.size();r++) {
String price=	driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[4]")).getText();	
	System.out.println(price);
	 totalprice= totalprice + Integer.parseInt(price);
	}
	 System.out.print(totalprice);

	}

}
