package com.BibliotecaDemo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BibliotecaDemo.models.Libro;

@Service
public class LibroService {

    public List<Libro> getLibros() throws ParseException {
    	SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        List<Libro> lista = new ArrayList<>();
     
        Libro libro1 = new Libro();
        libro1.setIsbn("TN2235");
        libro1.setNombre("Programación en SPRING");
        libro1.setAutor("Carlos Hernández");
        libro1.setAnioPublicacion(getYearFormat.parse("2025"));
        libro1.setEditorial("Santillana");
        libro1.setClasificacion("Programación");
        libro1.setNumeroInventario(001);
        libro1.setActivo(true);
        lista.add(libro1);

        
        Libro libro2 = new Libro();
        libro2.setIsbn("TN2236");
        libro2.setNombre("Java Avanzado");
        libro2.setAutor("Ana López");
        libro2.setAnioPublicacion(getYearFormat.parse("2024"));
        libro2.setEditorial("Pearson");
        libro2.setClasificacion("Programación");
        libro2.setNumeroInventario(002);
        libro2.setActivo(false);
        lista.add(libro2);

        
        Libro libro3 = new Libro();
        libro3.setIsbn("TN2237");
        libro3.setNombre("Metodología Ágil");
        libro3.setAutor("José Ramírez");
        libro3.setAnioPublicacion(getYearFormat.parse("2000"));
        libro3.setEditorial("Alfaomega");
        libro3.setClasificacion("Metodologías Ágiles");
        libro3.setNumeroInventario(003);
        libro3.setActivo(true);
        lista.add(libro3);

        
        Libro libro4 = new Libro();
        libro4.setIsbn("TN2238");
        libro4.setNombre("Ciberseguridad 101");
        libro4.setAutor("Luis Gómez");
        libro4.setAnioPublicacion(getYearFormat.parse("2019"));
        libro4.setEditorial("McGraw-Hill");
        libro4.setClasificacion("Seguridad Informática");
        libro4.setNumeroInventario(004);
        libro4.setActivo(false);
        lista.add(libro4);

        
        Libro libro5 = new Libro();
        libro5.setIsbn("TN2239");
        libro5.setNombre("Bases de Datos Relacionales");
        libro5.setAutor("Mariana Ruiz");
        libro5.setAnioPublicacion(getYearFormat.parse("2021"));
        libro5.setEditorial("Springer");
        libro5.setClasificacion("Bases de Datos");
        libro5.setNumeroInventario(005);
        libro5.setActivo(true);
        lista.add(libro5);

        
        Libro libro6 = new Libro();
        libro6.setIsbn("TN2240");
        libro6.setNombre("Redes de Computadoras");
        libro6.setAutor("Raúl Fernández");
        libro6.setAnioPublicacion(getYearFormat.parse("2018"));
        libro6.setEditorial("Wiley");
        libro6.setClasificacion("Redes");
        libro6.setNumeroInventario(006);
        libro6.setActivo(false);
        lista.add(libro6);

        
        Libro libro7 = new Libro();
        libro7.setIsbn("TN2241");
        libro7.setNombre("Desarrollo Web Moderno");
        libro7.setAutor("Laura Castillo");
        libro7.setAnioPublicacion(getYearFormat.parse("2022"));
        libro7.setEditorial("O'Reilly");
        libro7.setClasificacion("Desarrollo Web");
        libro7.setNumeroInventario(007);
        libro7.setActivo(true);
        lista.add(libro7);

        
        Libro libro8 = new Libro();
        libro8.setIsbn("TN2242");
        libro8.setNombre("Sistemas Operativos Linux");
        libro8.setAutor("Javier Torres");
        libro8.setAnioPublicacion(getYearFormat.parse("2015"));
        libro8.setEditorial("MIT Press");
        libro8.setClasificacion("Sistemas Operativos");
        libro8.setNumeroInventario(112);
        libro8.setActivo(false);
        lista.add(libro8);

        
        Libro libro9 = new Libro();
        libro9.setIsbn("TN2243");
        libro9.setNombre("Big Data para Todos");
        libro9.setAutor("Patricia Rivas");
        libro9.setAnioPublicacion(getYearFormat.parse("2020"));
        libro9.setEditorial("Packt Publishing");
        libro9.setClasificacion("Big Data");
        libro9.setNumeroInventario(011);
        libro9.setActivo(true);
        lista.add(libro9);

        
        Libro libro10 = new Libro();
        libro10.setIsbn("TN2244");
        libro10.setNombre("Cloud Computing Avanzado");
        libro10.setAutor("Diego Méndez");
        libro10.setAnioPublicacion(getYearFormat.parse("2023"));
        libro10.setEditorial("IBM Press");
        libro10.setClasificacion("Cloud Computing");
        libro10.setNumeroInventario(010);
        libro10.setActivo(false);
        lista.add(libro10);

        
        Libro libro11 = new Libro();
        libro11.setIsbn("TN2245");
        libro11.setNombre("Inteligencia Artificial Aplicada");
        libro11.setAutor("Mariana Ruiz");
        libro11.setAnioPublicacion(getYearFormat.parse("2022"));
        libro11.setEditorial("No Starch Press");
        libro11.setClasificacion("Inteligencia Artificial");
        libro11.setNumeroInventario(014);
        libro11.setActivo(true);
        lista.add(libro11);

        
        Libro libro12 = new Libro();
        libro12.setIsbn("TN2246");
        libro12.setNombre("Inteligencia de Negocios y BI");
        libro12.setAutor("Roberto Vargas");
        libro12.setAnioPublicacion(getYearFormat.parse("2021"));
        libro12.setEditorial("Cambridge University Press");
        libro12.setClasificacion("Inteligencia de Negocios");
        libro12.setNumeroInventario(015);
        libro12.setActivo(false);
        lista.add(libro12);

        
        Libro libro13 = new Libro();
        libro13.setIsbn("TN2247");
        libro13.setNombre("Testing de Software");
        libro13.setAutor("Sofía Martínez");
        libro13.setAnioPublicacion(getYearFormat.parse("2017"));
        libro13.setEditorial("Addison-Wesley");
        libro13.setClasificacion("Testing de Software");
        libro13.setNumeroInventario(016);
        libro13.setActivo(false);
        lista.add(libro13);
        
        return lista;
    }
}
