package com.BibliotecaDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BibliotecaDemo.models.Clasificacion;

@Service
public class ClasificacionService {

    public List<Clasificacion> getClasificaciones() {
        List<Clasificacion> lista = new ArrayList<>();

        Clasificacion clas1 = new Clasificacion();
        clas1.setId(1);
        clas1.setNombre("Programación");
        clas1.setDescripcion("Libros relacionados con programación y desarrollo de software.");
        lista.add(clas1);

        Clasificacion clas2 = new Clasificacion();
        clas2.setId(2);
        clas2.setNombre("Bases de Datos");
        clas2.setDescripcion("Libros especializados en gestión y diseño de bases de datos.");
        lista.add(clas2);

        Clasificacion clas3 = new Clasificacion();
        clas3.setId(3);
        clas3.setNombre("Redes");
        clas3.setDescripcion("Libros sobre redes, protocolos y telecomunicaciones.");
        lista.add(clas3);

        Clasificacion clas4 = new Clasificacion();
        clas4.setId(4);
        clas4.setNombre("Metodologías Ágiles");
        clas4.setDescripcion("Libros sobre metodologías ágiles de desarrollo de software.");
        lista.add(clas4);

        Clasificacion clas5 = new Clasificacion();
        clas5.setId(5);
        clas5.setNombre("Inteligencia Artificial");
        clas5.setDescripcion("Libros relacionados con IA y Machine Learning.");
        lista.add(clas5);

        Clasificacion clas6 = new Clasificacion();
        clas6.setId(6);
        clas6.setNombre("Seguridad Informática");
        clas6.setDescripcion("Libros sobre ciberseguridad y protección de sistemas.");
        lista.add(clas6);

        Clasificacion clas7 = new Clasificacion();
        clas7.setId(7);
        clas7.setNombre("Sistemas Operativos");
        clas7.setDescripcion("Libros sobre sistemas operativos y su funcionamiento.");
        lista.add(clas7);

        Clasificacion clas8 = new Clasificacion();
        clas8.setId(8);
        clas8.setNombre("Desarrollo Web");
        clas8.setDescripcion("Libros relacionados con el desarrollo de aplicaciones web.");
        lista.add(clas8);

        Clasificacion clas9 = new Clasificacion();
        clas9.setId(9);
        clas9.setNombre("DevOps");
        clas9.setDescripcion("Libros sobre integración continua, despliegue y operaciones.");
        lista.add(clas9);

        Clasificacion clas10 = new Clasificacion();
        clas10.setId(10);
        clas10.setNombre("Big Data");
        clas10.setDescripcion("Libros sobre análisis y gestión de grandes volúmenes de datos.");
        lista.add(clas10);

        Clasificacion clas11 = new Clasificacion();
        clas11.setId(11);
        clas11.setNombre("Cloud Computing");
        clas11.setDescripcion("Libros sobre computación en la nube y servicios distribuidos.");
        lista.add(clas11);

        Clasificacion clas12 = new Clasificacion();
        clas12.setId(12);
        clas12.setNombre("Inteligencia de Negocios");
        clas12.setDescripcion("Libros sobre BI y análisis de datos empresariales.");
        lista.add(clas12);

        Clasificacion clas13 = new Clasificacion();
        clas13.setId(13);
        clas13.setNombre("Testing de Software");
        clas13.setDescripcion("Libros sobre pruebas de software y aseguramiento de calidad.");
        lista.add(clas13);

        return lista;
    }
}
