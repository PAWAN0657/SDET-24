package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class handling_disabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/disabled.html");
		w.findElement(By.xpath("//input[@id='d1']")).sendKeys("admin");
		RemoteWebDriver r=(RemoteWebDriver)w;
		r.executeScript("document.getElementById('d2').value='manager'");
		////here d2 is disabled element we cannot manually write anything in that element
		r.executeScript("document.getElementById('d2').value=''");///to delete text present in disabled textbox	
	}}
