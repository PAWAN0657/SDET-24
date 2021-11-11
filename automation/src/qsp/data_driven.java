package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class data_driven {
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("https://demo.actitime.com/");
		a.add("admin");
		a.add("admin@actitime.com");
		a.add("manager");
		System.out.println(a.get(2));
		
		HashMap<String,String> map=new HashMap<>();
		map.put("url","https://demo.actitime.com/");
		map.put("username", "admin");
		map.put("email", "admin@actitime.com");
		map.put("password", "manager");
		System.out.println(map.get("password"));
		}}		
		
