package com.BibliotecaDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BibliotecaDemo.models.Libro;

@Service
public class LibroService {

    @Autowired
    private ILibro libroDao;  // DAO inyectado automáticamente

    public boolean guardarLibro(Libro libro) {
        return libroDao.guardar(libro);
    }

    public Libro obtenerLibroPorId(int idInventario) {
        return libroDao.recuperarPorId(idInventario);
    }

    public boolean modificarLibro(Libro libro) {
        return libroDao.modificar(libro);
    }

    public boolean eliminarLibro(int idInventario) {
        return libroDao.borrar(idInventario);
    }

    public List<Libro> listarLibros() {
        return libroDao.listarLibros();
    }
}
