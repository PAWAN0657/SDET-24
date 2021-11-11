package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_alligned {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args){
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
	WebElement w1 = w.findElement(By.id("username"));
	WebElement w3 = w.findElement(By.name("pwd"));
	//Dimension height = w1.getSize();//////getsize gives dimension datatype
int uslocation = w1.getLocation().getX();
int pwdlocation = w3.getLocation().getX();
if(uslocation==pwdlocation)
{
	System.out.println("alligned");
}
else
{
	System.out.println("not alligned");
}
w.close();
}}
