package com.actiTime.generics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@Test(priority = 1,invocationCount = 2)
		public void EditCustomer() {
		Reporter.log("EditCustomer",true);
		}
		@Test
		 public void RegisterCustomer() {
		 Reporter.log("RegisterCustomer",true);
		 }

        @Test
		public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
		}
		
        @BeforeMethod
		public void Login() {
		 Reporter.log("Login",true);
		 }
		
		@AfterMethod
        public void Logout() {
		Reporter.log("Logout",true);
		}
		
		@BeforeClass
		public void OpenBrowser() {
			Reporter.log("OpenBrowser",true);
			}
		
		@AfterClass
		public void CloseBrowser() {
			Reporter.log("CloseBrowser",true);
			}
}
				
