package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printtitle_alltabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> allwh = w.getWindowHandles();
		
		for (String s : allwh) {
			w.switchTo().window(s);
			System.out.println(w.getTitle());
		}
		w.quit();
		}}