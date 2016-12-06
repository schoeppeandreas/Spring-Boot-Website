package de.ans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loopdata")
public class LoopDataController {

	@RequestMapping("/list")
	public String list(){
		return "loopdata/list";
		
	}
	
}
