package HandlingWebTables;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingDynamicTableWithPagination {

	public static void main(String[] args) throws InterruptedException   {
WebDriver driver=new ChromeDriver();

driver.get("https://demo.opencart.com/admin/index.php");
driver.manage().window().maximize();
//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//Declare and initialise a fluent wait
Wait<WebDriver> wait
= new FluentWait<WebDriver>(driver)
      .withTimeout(Duration.ofSeconds(30))
      .pollingEvery(Duration.ofSeconds(10))
      .ignoring(TimeoutException.class);

//This is how we specify the condition to wait on.
//This is what we will explore more in this chapter

WebElement username=driver.findElement(By.xpath("//input[@id='input-username']"));
username.clear();
username.sendKeys("demo");
WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
password.clear();
password.sendKeys("demo");
Thread.sleep(5000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit'][@class='btn btn-primary']")));
WebElement LoginB=driver.findElement(By.xpath("//button[@type='submit'][@class='btn btn-primary']"));
LoginB.click();
//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#collapse-5']")));
WebElement customer=driver.findElement(By.xpath("//a[@href='#collapse-5']"));
customer.click();
WebElement customer1=driver.findElement(By.xpath("//ul[@id='collapse-5']//li[1]"));
	customer1.click();
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Pages')]")));
	String s=driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
	int totalPages=Integer.parseInt(s.substring(s.indexOf("(")+1,s.indexOf("Pages")-1));
	/*for(int i=0; i<3; i++){
		   driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		  }*/
	
	for(int p=1;p<=6;p++) {
	if(p>1) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='pagination']//*[text()="+p+"]")));
	WebElement ele=	driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
	ele.click();
	}
	}
	}}
