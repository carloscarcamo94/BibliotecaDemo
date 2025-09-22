package com.BibliotecaDemo.models;

public class Libro {
	
	//Propiedades
	private String isbn;
	private String nombre;
	private String autor;
	private String anioPublicacion;
	
	//Métodos Get and Set
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAnioPublicacion() {
		return anioPublicacion;
	}
	
	public void setAnioPublicacion(String anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
}