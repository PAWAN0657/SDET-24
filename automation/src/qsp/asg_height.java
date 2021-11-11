package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_height {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://www.facebook.com/");
	WebElement loginbtn = w.findElement(By.name("login"));
	int height = loginbtn.getSize().getHeight();
	int width = loginbtn.getSize().getWidth();
	System.out.println("height="+height);
	System.out.println("width="+width);
	w.close();
	}}