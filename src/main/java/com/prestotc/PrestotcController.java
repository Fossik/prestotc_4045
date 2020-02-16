package com.prestotc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PrestotcController {

	@RequestMapping("/index") //map request to the /index html page
	public String index(){
		
		return "index";	
	}

	@RequestMapping(value="/index", method=RequestMethod.GET, headers= {"content-type=text/json"}) 
	public String readJSON() {
		return "index";
	}
	/*@RequestMapping(value="/index", method=RequestMethod.GET, params= {"loyalty=blue"}) 
	public String readBlue() {
		return "index";
	} this is just an example */
}

