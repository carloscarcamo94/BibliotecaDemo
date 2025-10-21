package com.BibliotecaDemo.services;

import com.BibliotecaDemo.models.Libro;

public interface ILibro {

	public boolean guardar(Libro libro);
	public Libro recuperar(String libro);
	public boolean modificar(Libro libro);
	public boolean borrar(String libro);
}
