package de.ans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import de.ans.entity.TheUser;
import de.ans.service.UsersService;

@Controller
@RequestMapping("/loopdata")
public class LoopDataController {

	@Autowired
	UsersService service;
	
	@RequestMapping("/list")
	public String list(Model model){
		model.addAttribute("users",service.getAllUser());
		return "loopdata/list";
		
	}
	
	@RequestMapping("/addItem/{id}")
	public String view(@PathVariable(value="id") Long id, Model model){
		model.addAttribute("user", service.getById(id));
		return "loopdata/user";
	}
	
}
