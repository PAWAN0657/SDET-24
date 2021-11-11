package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class billing {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver w=new ChromeDriver();
			w.get("");
			w.findElement(By.xpath("//img[@alt='Facebook']"));
			
		}}