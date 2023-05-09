package cibertec.edu.pe.appPrueba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.edu.pe.appPrueba.model.Persona;

@Controller
public class PersonasController {
	
	@GetMapping ("/personas")
	public String frmPersonas(Model model) {
		List<Persona> lstPersonas = new ArrayList<>();
		lstPersonas.add(new Persona("Emanuel", "Leiva", 20, "Perú"));
		lstPersonas.add(new Persona("Claudia", "Lopez", 19, "Perú"));
		model.addAttribute("listapersonas", lstPersonas);
		return "frmPersonas";
	}
}
