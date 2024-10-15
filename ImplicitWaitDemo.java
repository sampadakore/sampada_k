package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.get("https://demo.applitools.com/");
driver.manage().window().maximize();
//driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("admin");
WebElement ele=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
ele.sendKeys("admin");
//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");                                                                                                                 )
	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
WebElement elep=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
	elep.sendKeys("admin");
	WebElement elel=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='log-in']")));
	elel.click();
	}

}
