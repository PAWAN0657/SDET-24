package com.actiTime.generics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
@Test
public void CreateCustomer() {
Reporter.log("CreateCustomer",true);
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
}
