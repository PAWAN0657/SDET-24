package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seelctall_mtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/Food.html");
		WebElement mtrlistbox = w.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		for (int i = 0; i <count; i++) {
			s.selectByIndex(i);///use index because it will never change
			}
		for (int i =count-1;i>=0; i--) {
			s.deselectByIndex(i);
			}
	w.close();		
}}
		
