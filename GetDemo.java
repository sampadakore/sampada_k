package getmethodsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDemo {

	public static void main(String[] args) throws InterruptedException {
		String title="You Store";
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
/*if(driver.getTitle().contains(title)){
System.out.println("title match");}
else {
	System.out.println("title not match");
}*/
System.out.println(driver.getCurrentUrl());
driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//System.out.println(driver.getPageSource());
//String id=driver.getWindowHandle();
//System.out.println("id of current webpage is "+id);
System.out.println(driver.getWindowHandles());
}

	}


