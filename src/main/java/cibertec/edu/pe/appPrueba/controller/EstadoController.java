package cibertec.edu.pe.appPrueba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.edu.pe.appPrueba.model.Estado;
 
@Controller
public class EstadoController {

	@GetMapping ("/estados")
	public String frmEstados(Model model) {
		List<Estado> lstestado = new ArrayList<>();
		lstestado.add(new Estado(1,"Activo"));
		model.addAttribute("listaestados",lstestado);
		return "frmEstados";
	}
}
