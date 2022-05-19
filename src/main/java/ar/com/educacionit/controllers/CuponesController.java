package ar.com.educacionit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.com.educacionit.domain.Cupones;
import ar.com.educacionit.enums.ViewsEnum;
import ar.com.educacionit.service.CuponesService;

@Controller
@RequestMapping("/cupon")
public class CuponesController {
	
	@Autowired
	private CuponesService service;
	
	//get
	
	
	//post
	
	//edit
	
	//listAll
	@GetMapping("/list")
	public String list(Model model) {
		
		//necesito consultar los datos
		List<Cupones> cupones = this.service.findAll();
		
		//voy a cargar en model los datos
		model.addAttribute("CUPONES", cupones);
		
		//pasarle a un html esos			
		
		return ViewsEnum.LISTADO.getView();
	}
	
	//new
	
	//delete
}
