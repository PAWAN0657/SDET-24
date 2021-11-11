package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_without_duplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
	HashSet<String> hs=new HashSet<>();
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/Food.html");
		WebElement mtrlistbox = w.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for(int i=0;i<count;i++)
		{
		String text = alloptions.get(i).getText();
		hs.add(text);
		}
		for(String s1 : hs)
		{
			System.out.println(s1);	
		}
		w.close();
		}}