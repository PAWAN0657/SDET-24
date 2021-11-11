package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeall_browsers_allchild {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://www.naukri.com/");
		String expectedtitle = w.getTitle();
		Set<String> allwh = w.getWindowHandles();
		
		for (String wh : allwh) 
		{
		w.switchTo().window(wh);
	    String actualtitle = w.getTitle();
	    
	    if (actualtitle.equals(expectedtitle)) {
	    }
	 else 
		{
w.close();
		}
		}
	}}