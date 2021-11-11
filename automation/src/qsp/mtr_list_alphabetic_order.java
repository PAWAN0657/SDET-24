package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtr_list_alphabetic_order {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		ArrayList<String> a=new ArrayList<>();
		WebDriver w=new ChromeDriver();
		TreeSet<String> t=new TreeSet<>();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/Food.html");
		WebElement mtrlistbox = w.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		///for(int i=0;i<count;i++)
		//{
		//String text = alloptions.get(i).getText();
		//t.add(text);
		//}
	//for ( String s1: t) 
//	{
		//System.out.println(s1);/////alphabetic order without duplicates
		//}
	for (int i = 0; i <count; i++) {
		String text = alloptions.get(i).getText();
		a.add(text);
		}
	Collections.sort(a);
	for (String s1: a) {
		System.out.println(s1);//alphabetic order with duplicates
	}
	w.close();
	}}
