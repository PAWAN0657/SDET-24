package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_loginbutton_enabled {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	///boolean loginbtn = w.findElement(By.xpath("//button")).isEnabled();
	boolean loginbtn = w.findElement(By.name("login")).isEnabled();
	if(loginbtn==true)
	{
		System.out.println("it is enabled");
		}
	else
		System.out.println("not enabled");
}}
