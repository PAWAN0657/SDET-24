package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asg_rate_of_engineering_work {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}
public static void main(String[] args) throws InterruptedException{
	WebDriver w=new ChromeDriver();
	w.get("https://demo.actitime.com/administration/btlist.do");
	w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(4000);
	w.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(4000);
	w.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(4000);
	w.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	w.findElement(By.xpath("//a[.='Types of Work']")).click();
	String rate = w.findElement(By.xpath("//a[.='engineering']/../../td[4]/span")).getText();
System.out.println(rate);
}}