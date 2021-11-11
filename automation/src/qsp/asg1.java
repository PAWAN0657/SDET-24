package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg1 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) {
	WebDriver w=new ChromeDriver();
	w.get("https://www.google.com/");
	String title = w.getTitle();
	System.out.println(title);
	if(title.equals("Google"))
	{
	System.out.println("valid title");
	}
	else 
	{
	System.out.println("invalid title");	
	}
	String url = w.getCurrentUrl();
	System.out.println(url);
	if(url.equals("https://www.google.com/"))
	{
		System.out.println("valid url");
	}
		else
		{
			System.out.println("invalid url");
		}
	w.close();
	
}}

