package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_allignement_naukri {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
w.get("https://www.naukri.com/");
int skillalgn = w.findElement(By.xpath("//input[@name='keyword']")).getLocation().getY();
int lctnalgn = w.findElement(By.xpath("//input[@name='location']")).getLocation().getY();
if (skillalgn==lctnalgn)
{
	System.out.println("they are alligned");
}
else
{
	System.out.println("not alligned");
}
}}
