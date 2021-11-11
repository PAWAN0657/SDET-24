package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_submit_button {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("http://demo.opensourcebilling.org/en/users/sign_in");
	w.findElement(By.xpath("//button")).submit();
	Thread.sleep(5000);
	w.close();
}}
