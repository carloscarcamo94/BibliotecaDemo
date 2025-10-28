package com.BibliotecaDemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class ConexionMySql {

    private final String user = "root";

    private final String pass = "";

    private final String url = "jdbc:mysql://localhost:3306/bibliotecademo";

    private final String driver = "com.mysql.cj.jdbc.Driver";

    private Connection con = null;

    public Connection getConexion(){

        try {

            Class.forName(driver);

            con = DriverManager.getConnection(this.url,this.user,this.pass);

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e);

        }

        return con;

    }

    public void close(){

        try {

            con.close();

        } catch (SQLException e) {

            System.out.println("cerrando");

        }

    }
 
}
