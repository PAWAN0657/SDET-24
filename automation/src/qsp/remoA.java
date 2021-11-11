package qsp;

import org.openqa.selenium.WebDriver;

public class remoA {
	public static void zest(WebDriver d)
	{
		d.get("https://www.flipkart.com/");
		System.out.println(d.getTitle());
		d.close();
	}

}
