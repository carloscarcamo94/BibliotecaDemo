package com.BibliotecaDemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BibliotecaDemo.models.Libro;

@Service
public class LibroService {

	@Autowired
	private ILibro libroDao;
	
	public boolean guardarLibro(Libro libro) {
        return libroDao.guardar(libro);
    }

    public Libro obtenerLibro(int idInventario) {
        return libroDao.recuperar(idInventario);
    }

    public boolean modificarLibro(Libro libro) {
        return libroDao.modificar(libro);
    }

    public boolean eliminarLibro(int idInventario) {
        return libroDao.borrar(idInventario);
    }

}
