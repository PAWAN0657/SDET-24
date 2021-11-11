package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_gender_radiobtn_alligned {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	w.get("https://en-gb.facebook.com/");
	w.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	int falgn = w.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
	int malgn = w.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
	int calgn = w.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
	if(falgn==malgn && falgn==calgn && malgn==calgn)
	{
		System.out.println("properly alligned");
	}
	else
		System.out.println("not alligned");
w.close();
}}
