package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_name_price {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(11,TimeUnit.SECONDS);
		w.get("https://www.flipkart.com/");
		WebElement search = w.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("iphone 12"+Keys.ENTER);
		List<WebElement> product = w.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = w.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		int count = product.size();
		System.out.println(count);
		
		for (int i = 0;i<count; i++) {
			System.out.println(product.get(i).getText()+"==>"+price.get(i).getText());
			}
		w.close();
		}}
