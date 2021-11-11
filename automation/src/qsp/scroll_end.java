package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_end {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) w;
		Thread.sleep(4444);
		///scroll to bottom of webpage
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4444);
		///scroll to top of webpage
		j.executeScript("window.scrollTo(0,0)");
		
	}}