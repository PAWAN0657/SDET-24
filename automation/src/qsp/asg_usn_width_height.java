package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_usn_width_height {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/login.do");
int usnwidth = w.findElement(By.xpath("//input[@name='username']")).getSize().getWidth();
int pwdwidth = w.findElement(By.xpath("//input[@name='pwd']")).getSize().getWidth();
int usnheight = w.findElement(By.xpath("//input[@name='username']")).getSize().getHeight();
int pwdheight = w.findElement(By.xpath("//input[@name='pwd']")).getSize().getHeight();
if (usnwidth==pwdwidth )
{
	System.out.println("same width");
}
else
{
	System.out.println("width not same");
	}
if(usnheight==pwdheight)
{
	System.out.println("same height");
}
else
{
	System.out.println("not same height");
}
	
	w.close();
}}