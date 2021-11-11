package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://demo.actitime.com/login.do");
		WebElement actilink = w.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions a=new Actions(w);
		a.contextClick(actilink).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		w.quit();
		}}
		