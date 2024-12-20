package datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	static void MonthYearDate(WebDriver driver,String month,String date,String year) {
	
	while(true) {
		
		String Actualmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Actualyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(Actualmonth.equals(month) && Actualyear.equals(year)) {
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
	List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	for(WebElement d:dates) {
		d.getText();
		
		if(d.getText().equals(date)) {
			d.click();
			break;
		}}
	}
	

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/datepicker/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.switchTo().frame(0);
driver.findElement(By.xpath("//input[@id='datepicker']")).click();
String month="May";
String date="10";
String year="2024";
MonthYearDate(driver,month,date,year);
//String month="May";
//String year="2024";

//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr[3]//td[4]//a")).click();
}

}
