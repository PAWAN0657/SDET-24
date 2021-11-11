package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class copypaste_emailtxtbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.get("http://demo.opensourcebilling.org/en/users/sign_in");
		w.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(4444);
		w.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		Thread.sleep(4444);
		}}
