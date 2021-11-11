package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			WebDriver w=new ChromeDriver();
			w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/demo.html");///static webpage created in my laptop if posted in server it becomes a webapplication
		    w.findElement(By.cssSelector("a[id='d1']")).click();
			Thread.sleep(4444);
			w.navigate().back();
			w.findElement(By.cssSelector("a[name='n1']")).click();
			Thread.sleep(4444);
			w.navigate().back();
			w.findElement(By.cssSelector("a[class='c1']")).click();
			Thread.sleep(4444);
			w.navigate().back();
			w.findElement(By.cssSelector("a[href='https://jspiders.com/']")).click();
			Thread.sleep(4444);
			w.navigate().back();
			w.findElement(By.xpath("/html/body/a")).click();
}
}