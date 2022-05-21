package ar.com.educacionit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.educacionit.domain.Cupones;
import ar.com.educacionit.enums.ViewsEnum;
import ar.com.educacionit.service.CuponesService;

@Controller
@RequestMapping("/cupon")
public class CuponesController {
	
	@Autowired
	private CuponesService service;
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(
			@ModelAttribute("CUPON")
			Cupones cupon
			) {
		
		this.service.update(cupon);
		
		return "redirect:/cupon/list";
	}
	
	//carga el objeto cupon por su id
	@RequestMapping("/edit/{id}")
	public String edit(
			@PathVariable(name="id")
			Long id,
			Model model) {
		
		Cupones cupon = this.service.getById(id);
		
		model.addAttribute("CUPON",cupon);
		
		return "cupones/edit";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		//necesito consultar los datos
		List<Cupones> cupones = this.service.findAll();
		
		//voy a cargar en model los datos
		model.addAttribute("CUPONES", cupones);
		
		return ViewsEnum.LISTADO.getView();
	}
	
	//new
	@RequestMapping("/delete")
	public String delete(
		@RequestParam(value="id", required=true)
		Long id
		) {
		
		this.service.delete(id);
		
		return "redirect:/cupon/list";
	}
}
