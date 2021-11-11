package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_color_of_forgotpwd {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://en-gb.facebook.com/");//page should be in english format to get color
	WebElement frgtpwd = w.findElement(By.linkText("Forgotten password?"));//visible text also changes with language of page
	String color = frgtpwd.getCssValue("color");
	String fonttype = frgtpwd.getCssValue("font-family");
	String fontsize = frgtpwd.getCssValue("font-size");		
	System.out.println(color);
	System.out.println(fonttype);
	System.out.println(fontsize);
	
}}
