package com.actiTime.generics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	public static WebDriver w;
	@BeforeClass
	public void OpenBrowser() {
	Reporter.log("OpenBrowser",true);
	w=new ChromeDriver(); 
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void CloseBrowser() {
	Reporter.log("CloseBrowser",true);
	w.close();	
	}
	
	@BeforeMethod
	public void Login() {
	Reporter.log("Login",true);
	w.get("https://demo.actitime.com/login.do");
	w.findElement(By.id("username")).sendKeys("admin");
	w.findElement(By.name("pwd")).sendKeys("manager");
	w.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
    public void Logout() {
	Reporter.log("Logout",true);
	w.findElement(By.id("logoutLink")).click();;
	}
	}




