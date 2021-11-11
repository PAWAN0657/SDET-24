package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg4 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver w=new ChromeDriver();
	w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/demo.html");
	w.findElement(By.id("d1")).click();
	Thread.sleep(4000);
	w.navigate().back();
	w.findElement(By.name("n1")).click();
	Thread.sleep(4000);
	w.navigate().back();
	w.findElement(By.className("c1")).click();
	w.close();


}}