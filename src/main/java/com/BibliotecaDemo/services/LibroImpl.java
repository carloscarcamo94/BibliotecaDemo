package com.BibliotecaDemo.services;

import java.sql.*;

import org.springframework.stereotype.Repository;

import com.BibliotecaDemo.models.Libro;
import com.BibliotecaDemo.utils.ConexionMySql;


@Repository
public class LibroImpl implements ILibro {
    
	private ConexionMySql conexion;

    public LibroImpl() {
        this.conexion = new ConexionMySql();
    }

    @Override
    public boolean guardar(Libro libro) {
        String sql = "INSERT INTO libro (isbn, nombre, autor, editorial, anioPublicacion, clasificacion, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getIsbn());
            ps.setString(2, libro.getNombre());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getEditorial());
            ps.setDate(5, new java.sql.Date(libro.getAnioPublicacion().getTime())); // convierte java.util.Date a java.sql.Date
            ps.setString(6, libro.getClasificacion());
            ps.setBoolean(7, libro.isActivo());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public Libro recuperar(int idInventario) {
        String sql = "SELECT * FROM libro WHERE idInventario = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idInventario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Libro libro = new Libro();
                libro.setIdInventario(rs.getInt("idInventario"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAnioPublicacion(rs.getDate("anioPublicacion"));
                libro.setClasificacion(rs.getString("clasificacion"));
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
        String sql = "UPDATE libro SET nombre = ?, autor = ?, editorial = ?, anioPublicacion = ?, clasificacion = ?, activo = ? WHERE idInventario = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getNombre());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getEditorial());
            ps.setDate(4, new java.sql.Date(libro.getAnioPublicacion().getTime()));
            ps.setString(5, libro.getClasificacion());
            ps.setBoolean(6, libro.isActivo());
            ps.setString(7, libro.getIsbn());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean borrar(int idInventario) {
        String sql = "DELETE FROM libro WHERE idInventario = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idInventario);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
