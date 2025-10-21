package com.BibliotecaDemo.models;

import java.util.Date;

public class Libro {
	
	//Propiedades
	private String isbn;
	private String nombre;
	private String autor;
	private String editorial;
	private Date anioPublicacion;
	private String clasificacion;
	private int numeroInventario;
	private boolean activo;
	
	
	public int getNumeroInventario() {
		return numeroInventario;
	}

	public void setNumeroInventario(int numeroInventario) {
		this.numeroInventario = numeroInventario;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

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
	
	public Date getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(Date anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
}