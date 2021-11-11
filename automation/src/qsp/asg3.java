package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg3 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) {
	WebDriver w=new ChromeDriver();
	w.get("https://www.google.com/");
	String htmlcode = w.getPageSource();
	System.out.println(htmlcode);
	w.close();
}}