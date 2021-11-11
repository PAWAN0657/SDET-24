package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtrlist_only_duplicate {
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
		if (hs.add(text)==false) ////if we do not want to include duplicate use true condition
		{
			System.out.println(text);
		}
		}
		w.close();
		}}
