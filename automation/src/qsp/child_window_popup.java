package qsp;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws InterruptedException, AWTException{
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com/");
		String wh = w.getWindowHandle();
		System.out.println(wh);
		w.close();
		}}
