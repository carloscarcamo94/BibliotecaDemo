package com.BibliotecaDemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.BibliotecaDemo.models.Editorial;

@Service
public class EditorialService {

    public List<Editorial> getEditoriales() {
        List<Editorial> lista = new ArrayList<>();

        Editorial editorial1 = new Editorial();
        editorial1.setId(1);
        editorial1.setNombre("Santillana");
        editorial1.setPais("España");
        editorial1.setActivo(true);
        lista.add(editorial1);

        Editorial editorial2 = new Editorial();
        editorial2.setId(2);
        editorial2.setNombre("Pearson");
        editorial2.setPais("Estados Unidos");
        editorial2.setActivo(true);
        lista.add(editorial2);

        Editorial editorial3 = new Editorial();
        editorial3.setId(3);
        editorial3.setNombre("Alfaomega");
        editorial3.setPais("México");
        editorial3.setActivo(true);
        lista.add(editorial3);

        Editorial editorial4 = new Editorial();
        editorial4.setId(4);
        editorial4.setNombre("McGraw-Hill");
        editorial4.setPais("Estados Unidos");
        editorial4.setActivo(true);
        lista.add(editorial4);

        Editorial editorial5 = new Editorial();
        editorial5.setId(5);
        editorial5.setNombre("Wiley");
        editorial5.setPais("Estados Unidos");
        editorial5.setActivo(true);
        lista.add(editorial5);

        Editorial editorial6 = new Editorial();
        editorial6.setId(6);
        editorial6.setNombre("O'Reilly");
        editorial6.setPais("Estados Unidos");
        editorial6.setActivo(true);
        lista.add(editorial6);

        Editorial editorial7 = new Editorial();
        editorial7.setId(7);
        editorial7.setNombre("Addison-Wesley");
        editorial7.setPais("Estados Unidos");
        editorial7.setActivo(true);
        lista.add(editorial7);

        Editorial editorial8 = new Editorial();
        editorial8.setId(8);
        editorial8.setNombre("MIT Press");
        editorial8.setPais("Estados Unidos");
        editorial8.setActivo(true);
        lista.add(editorial8);

        Editorial editorial9 = new Editorial();
        editorial9.setId(9);
        editorial9.setNombre("Cambridge University Press");
        editorial9.setPais("Reino Unido");
        editorial9.setActivo(true);
        lista.add(editorial9);

        Editorial editorial10 = new Editorial();
        editorial10.setId(10);
        editorial10.setNombre("Springer");
        editorial10.setPais("Alemania");
        editorial10.setActivo(true);
        lista.add(editorial10);

        Editorial editorial11 = new Editorial();
        editorial11.setId(11);
        editorial11.setNombre("Packt Publishing");
        editorial11.setPais("Reino Unido");
        editorial11.setActivo(true);
        lista.add(editorial11);

        Editorial editorial12 = new Editorial();
        editorial12.setId(12);
        editorial12.setNombre("No Starch Press");
        editorial12.setPais("Estados Unidos");
        editorial12.setActivo(true);
        lista.add(editorial12);

        Editorial editorial13 = new Editorial();
        editorial13.setId(13);
        editorial13.setNombre("IBM Press");
        editorial13.setPais("Estados Unidos");
        editorial13.setActivo(true);
        lista.add(editorial13);


        return lista;
    }
}
