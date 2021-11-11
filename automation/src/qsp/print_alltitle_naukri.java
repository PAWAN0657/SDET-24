package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_alltitle_naukri {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://www.naukri.com/");
		Set<String> allwh = w.getWindowHandles();
		
		for (String wh : allwh) 
		{
		w.switchTo().window(wh);
		System.out.println(w.getTitle());
		}
		
		w.quit();
	}}