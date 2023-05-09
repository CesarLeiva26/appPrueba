package cibertec.edu.pe.appPrueba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.edu.pe.appPrueba.model.Promedio;

@Controller
public class PromedioController {

	@GetMapping("/promedio")
	public String frmPromedio(Model model) {
		List<Promedio> lstPromedio = new ArrayList<>();
		lstPromedio.add(new Promedio(12, 12, 20 ));
		lstPromedio.add(new Promedio(16, 14, 15 ));
		lstPromedio.add(new Promedio(18, 12, 17 ));
		model.addAttribute("listaPromedio", lstPromedio);
		return "frmPromedio";
	}
}