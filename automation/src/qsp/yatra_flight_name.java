package qsp;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yatra_flight_name {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriver w=new ChromeDriver(c);
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.yatra.com/");
		w.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		w.findElement(By.xpath("(//div[@class='ac_airport'])[3]")).click();
		w.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).click();
		w.findElement(By.xpath("(//div[@class='ac_airport'])[6]")).click();
		w.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		w.findElement(By.xpath("//td[@title='Friday, 15 October 2021']")).click();
		
		w.findElement(By.xpath("//input[@id='BE_flight_arrival_date']")).click();
		w.findElement(By.xpath("//td[@title='Saturday, 23 October 2021']")).click();
		
		w.findElement(By.xpath("//input[@class='js_ripple search-btn ']")).click();
		
		List<WebElement> flightname = w.findElements(By.xpath("//p[@class='normal fs-10 fs-10 abs font-lightestgrey no-wrap mt-2 fl-no']"));
		List<WebElement> depttime = w.findElements(By.xpath("//div[@class='i-b pr']"));
		int count = flightname.size();
		for (int i = 0; i < count; i++) {
			System.out.println( flightname.get(i).getText()+"   "+ depttime.get(i).getText());
			}
		}}
