package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_vertically {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor)w;
		j.executeScript("window.scrollBy(0,4000)");
		}}