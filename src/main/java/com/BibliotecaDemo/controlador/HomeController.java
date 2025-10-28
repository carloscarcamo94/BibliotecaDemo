package com.BibliotecaDemo.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.BibliotecaDemo.models.Libro;
import com.BibliotecaDemo.services.LibroService;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private LibroService libroService; // ✅ solo usamos el servicio

    // Página principal: muestra el listado de libros
    @GetMapping
    public String home(Model model) {
        List<Libro> lista = libroService.listarLibros();
        model.addAttribute("libros", lista);
        return "home";
    }

    // Formulario para crear nuevo libro
    @GetMapping("/libro/nuevo")
    public String nuevoLibroForm(Model model) {
        model.addAttribute("libro", new Libro());
        return "nuevo_libro";
    }

    // Guardamos un nuevo libro
    @PostMapping("/libro/guardar")
    public String guardarLibro(@ModelAttribute Libro libro) {
        libroService.guardarLibro(libro);
        return "redirect:/";
    }

    // Mostramos los detalles de un libro específico
    @GetMapping("/libro/editar/{idInventario}")
    public String verLibro(@PathVariable("idInventario") int idInventario, Model model) {
        Libro libro = libroService.obtenerLibroPorId(idInventario);
        model.addAttribute("libro", libro);
        return "editar_libro";
    }
    // Actualizamos el libro
    @PostMapping("/libro/modificar")
    public String modificarLibro(@ModelAttribute Libro libro) {
        libroService.modificarLibro(libro);
        return "redirect:/";
    }

    // Eliminamos un libro por ID
    @GetMapping("/libro/eliminar/{idInventario}")
    public String eliminarLibro(@PathVariable("idInventario") int idInventario) {
        libroService.eliminarLibro(idInventario);
        return "redirect:/";
    }
}
