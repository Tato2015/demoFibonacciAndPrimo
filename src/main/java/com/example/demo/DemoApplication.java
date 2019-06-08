package com.example.demo;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	NumeroImpl numeroImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String getHome(Map<String, Object> model) {
		Numero numero= new Numero();
		model.put("numero", numero);
		return "home";
	}
	
	@RequestMapping(value="/form", method = RequestMethod.POST)
	public String getProceso(Model model,@ModelAttribute("numero") Numero numero, 
			BindingResult result) {
		
//		model.addAttribute("numero",new Numero());
		numeroImpl.mostarSerieFibonacci(numero.getNumeroIngreso());
		numero.setSumaFibonacci(numeroImpl.getNum().getSumaFibonacci());		
		numeroImpl.procesarNumeroPrimos(numero.getNumeroIngreso());
		numero.setSumaPrimos(numeroImpl.getNum().getSumaPrimos());
		return "home";
	}

}
