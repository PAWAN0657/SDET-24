package qsp;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_tabs1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		w.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		w.findElement(By.xpath("//div[.='Login ']")).click();
		w.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		w.findElement(By.xpath("//a[.='About your actiTIME']")).click();
		w.findElement(By.xpath("//a[.='Read Service Agreement']")).click();
		
		Set<String> allwh = w.getWindowHandles();
		Iterator<String> itr = allwh.iterator();
		String ptab = itr.next();
	    String ctab = itr.next();
	    
	    w.switchTo().window(ctab);
	    List<WebElement> headers = w.findElements(By.xpath("//u"));
	    for (WebElement w1 : headers) {
	    	System.out.println(w1.getText());
			}
	    w.close();
	    w.switchTo().window(ptab);
	    w.close();
		}}
