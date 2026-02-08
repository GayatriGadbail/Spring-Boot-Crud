package com.cjc.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Employee;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/")
	public String preLogin()
	{
		return "login";
		
	}
	@PostMapping("/reg")
	public String preRegister()
	{
		return "register";
		
	}
	@PostMapping("/register")
	public String preregData(@RequestBody Employee e)
	{
		hs.SaveData(e);
		return "login";
		
	}
	@GetMapping("/log")
	public String loginCheck(@RequestParam ("uname")String un,@RequestParam ("password")String ps,ModelMap m )
	{
	Employee e=hs.loginCheck(un,ps);
	Iterable list=hs.displayAllData();
	m.addAttribute("data", list);
		return "success";
		
	}
	@GetMapping("/delete")
	public String deleteData(@ModelAttribute Employee e,ModelMap m)
	{
		hs.deleteData(e);
	Iterable list=hs.displayAllData();
	m.addAttribute("data", list);
		return "success";
		
	}
	@GetMapping("/edit")
	public String editData(@RequestParam ("uid")int uid,ModelMap m)
	{
	      Employee e=hs.editData(uid);
	      m.addAttribute("data", e);
		return "edit";
		
	}
	
	@GetMapping("/updateemp")
	public String updateData(@ModelAttribute Employee e,ModelMap m)
	{
		    hs.SaveData(e);
		    Iterable list=hs.displayAllData();
			m.addAttribute("data", list);
		return "success";
		
	}

}
