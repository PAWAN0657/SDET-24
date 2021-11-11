package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_fblogin_isempty {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	w.findElement(By.xpath("//input[@name='email']")).sendKeys("pawan");
	boolean emailvalue = w.findElement(By.xpath("//input[@name='email']")).getAttribute("value").isEmpty();
	if(emailvalue==true)
	{
		System.out.println("email value is empty");
	}
	else
		System.out.println("not empty");
}}