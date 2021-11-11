package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg5 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver w=new ChromeDriver();
	w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/demo.html");
	w.findElement(By.linkText("Google")).click();
	w.navigate().back();
	Thread.sleep(4000);
	w.findElement(By.partialLinkText("oog")).click();
	w.close();
	
}}
