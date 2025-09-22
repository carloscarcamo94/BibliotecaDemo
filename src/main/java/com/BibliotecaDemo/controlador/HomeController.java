package com.BibliotecaDemo.controlador;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BibliotecaDemo.models.Libro;

@Controller
public class HomeController {
	
	@GetMapping
	public String mostrarHome (Model model) {
		
		String mensaje = "Listado de libros más vistos";
		String ejemplares = "Ejemplares";
		int cantidad = 15;
		boolean disponible = false;
		LocalDate fecha = LocalDate.now();
		double multa = 5.25d;
		
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("ejemplares", ejemplares);
		model.addAttribute("cantidad", cantidad);
		model.addAttribute("disponible", disponible);
		model.addAttribute("fecha", fecha);
		model.addAttribute("multa", multa);
		
		//Pasar libro a la vista
		Libro libro = new Libro();
		libro.setIsbn("TN2235");
		libro.setNombre("Programación en SPRING");
		libro.setAutor("Carlos");
		libro.setAnioPublicacion("2025");
		
		model.addAttribute("libro", libro);
		
		return "home";
	}
}
