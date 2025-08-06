package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Student;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/")
	public String prelogin()
	{
		return "login";
		
	}
	
	@PostMapping("/reg")
	public String preReg()
	{
		return "register";
		
	}
	@PostMapping("/register")
	public String regData(@RequestBody Student s)
	{
		hs.SaveData(s);
		return "login";
		
	}
	@GetMapping("/log")
	public String loginCheck(@RequestParam("uname")String un,@RequestParam("password")String ps,ModelMap m)
	{
		Student s= hs.loginCheck(un,ps);
		Iterable list= hs.displayAllData();
		m.addAttribute("data", list);
		
		return "success";
	}	
	 @GetMapping("/delete")
    public String deleteData(@ModelAttribute Student S,ModelMap m)
    {
		  hs.deleteData(S);
		Iterable list=hs.displayAllData();
		m.addAttribute("data",list);
		return "success";
    
    }
	 @GetMapping("/edit")
	 public String editData(@RequestParam("uid")int uid,ModelMap m)
	 {
		Student s= hs.editData(uid);
		m.addAttribute("data",s);
		return "edit";
		
	}
	 @GetMapping("/updatestu")
	 public String UpdateData(@ModelAttribute Student S,ModelMap m)
	 {
		    hs.SaveData(S);
		    Iterable list=hs.displayAllData();
		    m.addAttribute("data", list);
		    return"success";
		    
		    
	 }
}