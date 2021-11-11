package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handling_alert_popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args){
		WebDriver w=new ChromeDriver();
		w.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		w.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		WebDriverWait w1=new WebDriverWait(w,11);
		w1.until(ExpectedConditions.alertIsPresent());
		Alert a = w.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		w.close();
		}}
