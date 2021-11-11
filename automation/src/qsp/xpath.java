package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver w=new ChromeDriver();
			w.get("https://demo.actitime.com/login.do");
			w.findElement(By.xpath("//div[text()='Login ']")).click();
			
		}}
