package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException{
		WebDriver w=new ChromeDriver();
		w.get("file:///C:/Users/PAWAN0657/Desktop/qspider/selenium/Food.html");
		WebElement mtrlistbox = w.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		s.selectByIndex(4);
		Thread.sleep(4444);
		s.selectByValue("d");
		Thread.sleep(4444);
		s.selectByVisibleText("poori");
		System.out.println(s.isMultiple());
		w.close();
		}}
