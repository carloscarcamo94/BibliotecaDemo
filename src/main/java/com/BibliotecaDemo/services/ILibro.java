package com.BibliotecaDemo.services;

import com.BibliotecaDemo.models.Libro;

public interface ILibro {

	public boolean guardar(Libro libro);
	public Libro recuperar(int IdInventario);
	public boolean modificar(Libro libro);
	public boolean borrar(int idInventario);
}
