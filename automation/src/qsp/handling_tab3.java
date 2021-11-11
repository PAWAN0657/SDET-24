package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_tab3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		Set<String> alltabs = w.getWindowHandles();
		
		for (String s : alltabs) {
			w.switchTo().window(s);
			System.out.println(w.getTitle());
		}
		}}
