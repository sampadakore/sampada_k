package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommandDemo {

	public static void main(String[] args) throws MalformedURLException {
WebDriver driver=new ChromeDriver();
//driver.navigate().to("https://demo.nopcommerce.com/register");
URL obj=new URL("https://demo.nopcommerce.com/register");
driver.navigate().to(obj);
driver.navigate().to("https://demo.opencart.com/");
driver.navigate().back();
System.out.println(driver.getCurrentUrl());
driver.navigate().forward();
System.out.println(driver.getCurrentUrl());
driver.navigate().refresh();
	}

}
