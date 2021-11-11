package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://www.vtiger.com/");
		w.manage().window().maximize();
		WebElement resource = w.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a=new Actions(w);
		a.moveToElement(resource).perform();
		w.findElement(By.xpath("(//a[contains(.,'Customers')])[1]")).click();
		WebElement readfullstory = w.findElement(By.xpath("//a[.='READ FULL STORY']"));
		a.doubleClick(readfullstory).perform();
		String title = w.getTitle();
		System.out.println(title);
		if (title.contains("HackerEarth")) 
		{
			System.out.println("is displayed");
		}
		else
			System.out.println("not displayed");
		w.close();
}}