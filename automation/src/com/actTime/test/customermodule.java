package com.actTime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actiTime.generics.BaseClass;

public class customermodule extends BaseClass {
		@Test
	public void testCreateCustomer() {
			Reporter.log("testCreateCustomer",true);	
		}
}
