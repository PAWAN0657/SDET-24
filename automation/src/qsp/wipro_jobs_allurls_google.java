package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wipro_jobs_allurls_google {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com/");
		WebElement search = w.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("WIPRO jobs"+Keys.ENTER);
	List<WebElement> link = w.findElements(By.tagName("a"));
	for (WebElement w1 : link) 
	{
		System.out.println(w1.getAttribute("href"));
	}
	w.close();
	}}
