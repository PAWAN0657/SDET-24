package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);
		w.get("https://www.flipkart.com/");
		w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		}}