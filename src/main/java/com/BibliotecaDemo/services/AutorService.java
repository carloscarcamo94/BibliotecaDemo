package com.BibliotecaDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BibliotecaDemo.models.Autor;

@Service
public class AutorService {

    public List<Autor> getAutores() {
        List<Autor> lista = new ArrayList<>();

        Autor autor1 = new Autor();
        autor1.setId(1);
        autor1.setNombre("Carlos Hernández");
        autor1.setNacionalidad("Salvadoreña");
        autor1.setActivo(true);
        lista.add(autor1);

        Autor autor2 = new Autor();
        autor2.setId(2);
        autor2.setNombre("Ana López");
        autor2.setNacionalidad("Guatemalteca");
        autor2.setActivo(true);
        lista.add(autor2);

        Autor autor3 = new Autor();
        autor3.setId(3);
        autor3.setNombre("José Ramírez");
        autor3.setNacionalidad("Hondureña");
        autor3.setActivo(true);
        lista.add(autor3);

        Autor autor4 = new Autor();
        autor4.setId(4);
        autor4.setNombre("María Pérez");
        autor4.setNacionalidad("Mexicana");
        autor4.setActivo(true);
        lista.add(autor4);

        Autor autor5 = new Autor();
        autor5.setId(5);
        autor5.setNombre("Luis Gómez");
        autor5.setNacionalidad("Colombiana");
        autor5.setActivo(true);
        lista.add(autor5);

        Autor autor6 = new Autor();
        autor6.setId(6);
        autor6.setNombre("Sofía Martínez");
        autor6.setNacionalidad("Argentina");
        autor6.setActivo(true);
        lista.add(autor6);

        Autor autor7 = new Autor();
        autor7.setId(7);
        autor7.setNombre("Raúl Fernández");
        autor7.setNacionalidad("Chilena");
        autor7.setActivo(true);
        lista.add(autor7);

        Autor autor8 = new Autor();
        autor8.setId(8);
        autor8.setNombre("Laura Castillo");
        autor8.setNacionalidad("Peruana");
        autor8.setActivo(true);
        lista.add(autor8);

        Autor autor9 = new Autor();
        autor9.setId(9);
        autor9.setNombre("Javier Torres");
        autor9.setNacionalidad("Uruguaya");
        autor9.setActivo(true);
        lista.add(autor9);

        Autor autor10 = new Autor();
        autor10.setId(10);
        autor10.setNombre("Patricia Rivas");
        autor10.setNacionalidad("Venezolana");
        autor10.setActivo(true);
        lista.add(autor10);

        Autor autor11 = new Autor();
        autor11.setId(11);
        autor11.setNombre("Diego Méndez");
        autor11.setNacionalidad("Mexicana");
        autor11.setActivo(true);
        lista.add(autor11);

        Autor autor12 = new Autor();
        autor12.setId(12);
        autor12.setNombre("Mariana Ruiz");
        autor12.setNacionalidad("Colombiana");
        autor12.setActivo(true);
        lista.add(autor12);

        Autor autor13 = new Autor();
        autor13.setId(13);
        autor13.setNombre("Roberto Vargas");
        autor13.setNacionalidad("Salvadoreña");
        autor13.setActivo(true);
        lista.add(autor13);

        return lista;
    }
}
