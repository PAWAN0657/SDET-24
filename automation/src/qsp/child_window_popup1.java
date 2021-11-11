package qsp;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window_popup1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws InterruptedException, AWTException{
		WebDriver w=new ChromeDriver();
		w.get("https://www.naukri.com/");
		Set<String> allwh = w.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		
		for (String wh : allwh) 
		{
			System.out.println(wh);
		}
		w.quit();
	}}
