package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sourcecode {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/demo.html");///static webpage created in my laptop if posted in server it becomes a webapplication
		//WebElement e=w.findElement(By.tagName("a"));
		//System.out.println(e);
		w.findElement(By.name("n1")).click();

	}
}
