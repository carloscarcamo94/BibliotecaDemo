package com.BibliotecaDemo;

import java.sql.Connection;

import com.BibliotecaDemo.utils.ConexionMySql;

public class Main {

	public static void main(String[] args) {
	    ConexionMySql c = new ConexionMySql();
	    Connection conn = c.getConexion();
	    if (conn != null) {
	        System.out.println("Conexión OK");
	        System.out.println(conn);
	    } else {
	        System.out.println("Conexión fallida");
	    }
	}

}
