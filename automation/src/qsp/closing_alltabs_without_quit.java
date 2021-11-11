package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closing_alltabs_without_quit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> allwh = w.getWindowHandles();
		
		Iterator<String> itr = allwh.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		w.switchTo().window(pwh);
		w.close();
		w.switchTo().window(cwh);
		w.close();
		}}
