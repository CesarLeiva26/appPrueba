package cibertec.edu.pe.appPrueba.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.edu.pe.appPrueba.model.Alumno;

@Controller
public class AlumnoController {

	@GetMapping("/alumnos")
	public String frmAlumnos(Model model) {
		List<Alumno> lstAlumnos = new ArrayList<>();
		lstAlumnos.add(new Alumno("Emanuel", "Leiva", "Perú"));
		lstAlumnos.add(new Alumno("Claudia", "Lopez", "Perú"));
		model.addAttribute("listaalumnos", lstAlumnos);

		return "frmAlumnos";
	}

}
