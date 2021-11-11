package com.projectName.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author PAWAN0657
 *
 */
public class webDriverCommonLib {

	/**
	 * 
	 * @param w
	 */
	public void waitForpagetoLoad(WebDriver w) {
		w.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	/**
	 * 
	 * @param w
	 * @param element
	 */
	public void waitForElement(WebDriver w,WebElement element) {
	WebDriverWait ww=new WebDriverWait(w, 10);
	ww.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @param element
	 */
	public void CustomWaitForElementisEnabled(WebElement element) {
int i=0;
while(i<100) {
	try {
		element.isEnabled();
		break;
	}
	catch(Exception e)
	{
	i++;
	}
	}
	
	}
	/**
	 * 
	 * @param element
	 * @param index
	 */
	public void select(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
		}
	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
		}
	
	}
