package qsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args) throws AWTException, InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		Actions a=new Actions(w);
		WebElement source = w.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = w.findElement(By.xpath("//h1[.='Block 4']"));
		Thread.sleep(4444);
		a.dragAndDrop(source, target).perform();
		}}
