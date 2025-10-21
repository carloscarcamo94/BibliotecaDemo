package com.BibliotecaDemo.services;

import java.sql.*;
import com.BibliotecaDemo.models.Libro;
import com.BibliotecaDemo.utils.ConexionMySql;

public class LibroImpl implements ILibro {
    
	private ConexionMySql conexion;

    public LibroImpl() {
        this.conexion = new ConexionMySql();
    }

    @Override
    public boolean guardar(Libro libro) {
        String sql = "INSERT INTO libro (isbn, nombre, autor, editorial, anioPublicacion, clasificacion, numeroInventario, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getIsbn());
            ps.setString(2, libro.getNombre());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getEditorial());
            ps.setDate(5, new java.sql.Date(libro.getAnioPublicacion().getTime())); // convierte java.util.Date a java.sql.Date
            ps.setString(6, libro.getClasificacion());
            ps.setInt(7, libro.getNumeroInventario());
            ps.setBoolean(8, libro.isActivo());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public Libro recuperar(String book) {
        String sql = "SELECT * FROM libro WHERE isbn = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, book);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Libro libro = new Libro();
                libro.setIsbn(rs.getString("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAnioPublicacion(rs.getDate("anioPublicacion"));
                libro.setClasificacion(rs.getString("clasificacion"));
                libro.setNumeroInventario(rs.getInt("numeroInventario"));
                libro.setActivo(rs.getBoolean("activo"));
                return libro;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public boolean modificar(Libro libro) {
        String sql = "UPDATE libro SET nombre = ?, autor = ?, editorial = ?, anioPublicacion = ?, clasificacion = ?, numeroInventario = ?, activo = ? WHERE isbn = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getNombre());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getEditorial());
            ps.setDate(4, new java.sql.Date(libro.getAnioPublicacion().getTime()));
            ps.setString(5, libro.getClasificacion());
            ps.setInt(6, libro.getNumeroInventario());
            ps.setBoolean(7, libro.isActivo());
            ps.setString(8, libro.getIsbn());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean borrar(String book) {
        String sql = "DELETE FROM libro WHERE isbn = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, book);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
