package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_value_present_in_textbox {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("http://demo.opensourcebilling.org/en/users/sign_in");
	String emailvalue = w.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
	System.out.println(emailvalue);
	
}}