package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
	}	
	public static void main(String[] args) throws InterruptedException {
		WebDriver w=new ChromeDriver();
		
		w.get("https://demo.actitime.com/login.do");
		w.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		w.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		w.findElement(By.xpath("//a[@id='loginButton']")).click();
		WebDriverWait wait=new WebDriverWait(w, 11);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));///use visibilityOfElementLocated when you need to find element which should be also visible
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));////use presenceOfElementLocated when you don't care whether if element visible or not, you just need to know if it's on the page.
w.findElement(By.linkText("Logout")).click();
w.close();
}}