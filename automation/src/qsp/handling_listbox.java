package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handling_listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		w.get("https://en-gb.facebook.com/");
		w.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	WebElement monthlink = w.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
	Select s=new Select(monthlink);
	s.selectByIndex(6);
	Thread.sleep(4444);
	s.selectByValue("6");
	Thread.sleep(4444);
	s.selectByVisibleText("Jan");
	}}
