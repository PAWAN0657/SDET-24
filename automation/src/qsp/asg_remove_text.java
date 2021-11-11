package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_remove_text {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/xpath.html");
	w.findElement(By.xpath("(//input[@type='text' ])[1]")).clear();
	Thread.sleep(4000);
	w.close();
	
}}
