package com.BibliotecaDemo.controlador;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.BibliotecaDemo.models.Autor;
import com.BibliotecaDemo.models.Clasificacion;
import com.BibliotecaDemo.models.Editorial;
import com.BibliotecaDemo.models.Libro;
import com.BibliotecaDemo.services.AutorService;
import com.BibliotecaDemo.services.ClasificacionService;
import com.BibliotecaDemo.services.EditorialService;
import com.BibliotecaDemo.services.LibroService;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String mostrarHome(Model model) throws ParseException {

        // Datos generales
        String mensaje = "Bienvenido a la Biblioteca Central";
        LocalDate fecha = LocalDate.now();
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("fecha", fecha);

        List<Libro> libros = libroService.getLibros();
        List<Autor> autores = autorService.getAutores();
        List<Editorial> editoriales = editorialService.getEditoriales();
        List<Clasificacion> clasificaciones = clasificacionService.getClasificaciones();

        model.addAttribute("libros", libros);
        model.addAttribute("autores", autores);
        model.addAttribute("editoriales", editoriales);
        model.addAttribute("clasificaciones", clasificaciones);

        return "home";
    }
	
	
		@Autowired
		private LibroService libroService;
	
		@GetMapping("/libros")
		public String mostrarLibros(Model model) throws ParseException {
		    List<Libro> listaLibros = libroService.getLibros();
		    model.addAttribute("libros", listaLibros);
		    return "LibrosListado";
		}


		@Autowired
		private AutorService autorService;

		@GetMapping("/autores")
		public String mostrarAutores(Model model) {
		    List<Autor> listaAutores = autorService.getAutores();
		    model.addAttribute("autores", listaAutores);
		    return "AutoresListado";
		}

		
		@Autowired
		private EditorialService editorialService;

		@GetMapping("/editoriales")
		public String mostrarEditoriales(Model model) {
		    List<Editorial> listaEditoriales = editorialService.getEditoriales();
		    model.addAttribute("editoriales", listaEditoriales);
		    return "EditorialesListado";
		}

		
		@Autowired
		private ClasificacionService clasificacionService;

		@GetMapping("/clasificaciones")
		public String mostrarClasificaciones(Model model) {
		    List<Clasificacion> listaClasificaciones = clasificacionService.getClasificaciones();
		    model.addAttribute("clasificaciones", listaClasificaciones);
		    return "ClasificacionesListado";
		}

	}

