package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsDemo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/register");

driver.manage().window().maximize();
//boolean a=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	//System.out.println(a);
//WebElement a=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//System.out.println(a.isDisplayed());
//boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//System.out.println(status);
/*WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
System.out.println("before selection.....");
System.out.println(male_rd.isSelected());
System.out.println(female_rd.isSelected());
System.out.println("after selecting male");
male_rd.click();
System.out.println(male_rd.isSelected());
female_rd.click();
System.out.println(female_rd.isSelected());*/
boolean newsletterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
System.out.println(newsletterstatus);


	}

}
