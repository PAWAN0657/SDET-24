package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_apple_iphone_12pro {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.amazon.in/s?k=iphone+12+pro&ref=nb_sb_noss_2");
	String price = w.findElement(By.xpath("//span[.='New Apple iPhone 12 Pro (128GB) - Pacific Blue']/../../../..//span[@class='a-price-whole']")).getText();
System.out.println("new apple iphone 12pro price is="+price);
}}