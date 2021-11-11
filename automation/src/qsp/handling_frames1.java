package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class handling_frames1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/page1.html");
		w.findElement(By.xpath("//input[@id='t1']")).sendKeys("q");
		w.switchTo().frame(0);
		w.findElement(By.xpath("//input[@id='t2']")).sendKeys("j");
		w.switchTo().defaultContent();
		w.findElement(By.xpath("//input[@id='t1']")).sendKeys("s");
		w.switchTo().frame("f1");
		w.findElement(By.xpath("//input[@id='t2']")).sendKeys("s");
		w.switchTo().parentFrame();
		w.findElement(By.xpath("//input[@id='t1']")).sendKeys("p");
		WebElement frame = w.findElement(By.xpath("//iframe"));
		w.switchTo().frame(frame);
		w.findElement(By.xpath("//input[@id='t2']")).sendKeys("p");
		}}