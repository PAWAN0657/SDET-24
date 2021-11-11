package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_textof_fgtpswd {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	String fgtpwd = w.findElement(By.xpath("//a[.='Forgot your password?']")).getText();
	System.out.println(fgtpwd);
	
}}