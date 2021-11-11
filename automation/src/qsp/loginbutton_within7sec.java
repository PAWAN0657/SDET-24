package qsp;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginbutton_within7sec {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);
		try {
		w.get("https://demo.actitime.com/login.do");
		System.out.println("page is loaded in 9 seconds");
		}
		catch (Exception e) {
			System.out.println("page not laoded");
		}
		w.close();
		}}
