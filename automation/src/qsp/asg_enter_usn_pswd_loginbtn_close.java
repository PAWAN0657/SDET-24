package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_enter_usn_pswd_loginbtn_close {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(4000);
	w.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(4000);
	w.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(4000);
	w.close();

}}