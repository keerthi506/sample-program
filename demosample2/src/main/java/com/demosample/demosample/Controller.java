package com.demosample.demosample;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
	public class Controller   
	{  
	@RequestMapping("msg")  
	public String hello()   
	{  
	return "Hello World";  
	}
	@RequestMapping("name")
	public String test()
	{
		return "keerthi";
	}
	
	@RequestMapping("details")
     List<Empdetails>  space() {
		
	List<Empdetails> list = new ArrayList<Empdetails>();
	list.add(new Empdetails("keerthi",22));
	list.add(new Empdetails("karthika",24));
	 return list;
	
	
	
	}  
}
 


