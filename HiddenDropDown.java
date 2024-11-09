package HandlingDropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException   {
WebDriver driver=new ChromeDriver();
driver.get("https://namitak-trials714.orangehrmlive.com/auth/seamlessLogin");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("jY9TS@D8bj");
driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//driver.findElement(By.xpath("//li[@id='left_menu_item_11']//a[1]//span[1]")).click();
driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[3]/ui-view[1]/div[1]/div[1]/div[1]/form[1]/employee-search[1]/div[4]/div[1]/div[1]/span[1]")).click();
//Actions act =  new Actions(driver);
//act.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[3]/ui-view[1]/div[1]/div[1]/div[1]/form[1]/employee-search[1]/div[4]/div[1]/div[1]/span[1]"))).click().perform();
	//Actions act=new Actions(driver);
//Thread.sleep(10000);
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[3]/ui-view[1]/div[1]/div[1]/div[1]/form[1]/employee-search[1]/div[4]/div[1]/div[1]/span[1]"))).click().perform();
	Thread.sleep(20000);
	//driver.findElement(By.xpath("//span[normalize-space()='Past Employees Only']")).click();
List<WebElement> item=driver.findElements(By.xpath("//div[@class='input-field col s6']//ul[@id='select-options-9db49c76-da8e-cbc5-1e21-3f79e3c1a30d']//span"));
int count=item.size();
System.out.println(count);
for(WebElement it:item) {
	System.out.println(it.getText());
}
	
	}
}
