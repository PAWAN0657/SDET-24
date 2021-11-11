package qsp;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remo {
public static void main(String[] args) throws Throwable {
	//green color means public class
	//by writing code or setting environment variable manually
//temporarily select path set property 
	//if we do it in environment variable we can't run it in every pc then we have to do it in client pc also instead do it by code 
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\PAWAN0657\\eclipse-workspace\\automation\\driver\\chromedriver.exe");//absolute path
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");//relative/generic way to create path
	ChromeDriver c=new ChromeDriver();// it opens google chrome browser
	ChromeDriver c1=new ChromeDriver();
	c.get("https://facebook.com");
	c1.get("https://gmail.com");
	String t=c.getTitle();
	String h = c1.getTitle();
	Thread.sleep(4554);
	System.out.println(t);
	System.out.println(h);
	c.quit();
	}
}
