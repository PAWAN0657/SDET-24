package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class handling_frames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/page1.html");
		w.switchTo().frame(0);
		w.findElement(By.xpath("//input[@id='t2']")).sendKeys("jsp");
		w.switchTo().parentFrame();
	    w.findElement(By.xpath("//input[@id='t1']")).sendKeys("qsp");
		}}