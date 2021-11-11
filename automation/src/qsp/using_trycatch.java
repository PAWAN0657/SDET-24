package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class using_trycatch {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		w.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		w.findElement(By.xpath("//a[@id='loginButton']")).click();

int i=0;
while(i<100)
{
try {
w.findElement(By.linkText("Logout")).click();
break;
}
catch(Exception e)
{
	i++;
}
}
}}
