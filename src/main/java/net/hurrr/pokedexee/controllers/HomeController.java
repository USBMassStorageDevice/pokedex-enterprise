package net.hurrr.pokedexee.controllers;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Path;

import net.hurrr.pokedexee.rest.PokemonResource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String root(Model model) {
		return "redirect:index.html";
	}
	
	@RequestMapping("/index.html")
	public String index(Model model) {		
		model.addAttribute("endpoints", findPathAnnotationValues(PokemonResource.class));
		return "index";
	}
		
	protected Map<String, String> findPathAnnotationValues(@SuppressWarnings("rawtypes") Class clazz) {
		@SuppressWarnings("unchecked") String prefix = "/rest/" + ((Path)clazz.getAnnotation(Path.class)).value();
		
		Map<String, String> retVal = new HashMap<String, String>();
		
		for (Method method : clazz.getDeclaredMethods()) {
			if (method.isAnnotationPresent(Path.class)) {
				retVal.put(method.getName(), prefix + method.getAnnotation(Path.class).value());
			}
		}
				
		return retVal;
	}	
}
