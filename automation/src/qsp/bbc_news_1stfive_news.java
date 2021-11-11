package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbc_news_1stfive_news {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://www.bbc.com/");
		List<WebElement> links = w.findElements(By.xpath("//span[@class='top-list-item__bullet']/../../..//h3"));
		for (WebElement w1 : links)
		{
			System.out.println(w1.getText());
		}
		w.close();
	}}
