package ar.com.educacionit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrimerController {

	@RequestMapping(value={"/","/home"})
	public String home() {
		return "index";
	}
	
	
}
