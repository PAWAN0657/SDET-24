package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) {
	WebDriver w=new ChromeDriver();
	w.manage().deleteAllCookies();
	w.manage().window().maximize();
	w.close();
}}