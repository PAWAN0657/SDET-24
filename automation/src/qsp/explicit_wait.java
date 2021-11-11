package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		w.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		w.findElement(By.xpath("//a[@id='loginButton']")).click();
		WebDriverWait wait=new WebDriverWait(w, 11);
		///wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		wait.until(ExpectedConditions.titleContains("Enter"));
		String title = w.getTitle();
		System.out.println(title);
		w.close();
		}}