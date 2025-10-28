package com.BibliotecaDemo.services;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BibliotecaDemo.models.Libro;
import com.BibliotecaDemo.utils.ConexionMySql;

@Repository
public class LibroImpl implements ILibro {

    @Autowired
    private ConexionMySql conexion;

    @Override
    public boolean guardar(Libro libro) {
        String sql = "INSERT INTO libro (isbn, nombre, autor, editorial, anioPublicacion, clasificacion, activo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getIsbn());
            ps.setString(2, libro.getNombre());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getEditorial());
            ps.setDate(5, new java.sql.Date(libro.getAnioPublicacion().getTime()));
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
    public Libro recuperarPorId(int idInventario) {
        String sql = "SELECT * FROM libro WHERE idInventario = ?";
        Libro libro = null;

        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idInventario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                libro = new Libro();
                libro.setIdInventario(rs.getInt("idInventario"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAnioPublicacion(rs.getDate("anioPublicacion"));
                libro.setClasificacion(rs.getString("clasificacion"));
                libro.setActivo(rs.getBoolean("activo"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return libro;
    }

    @Override
    public List<Libro> listarLibros() {
        List<Libro> lista = new ArrayList<>();
        String sql = "SELECT * FROM libro";

        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Libro libro = new Libro();
                libro.setIdInventario(rs.getInt("idInventario"));
                libro.setIsbn(rs.getString("isbn"));
                libro.setNombre(rs.getString("nombre"));
                libro.setAutor(rs.getString("autor"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAnioPublicacion(rs.getDate("anioPublicacion"));
                libro.setClasificacion(rs.getString("clasificacion"));
                libro.setActivo(rs.getBoolean("activo"));
                lista.add(libro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public boolean modificar(Libro libro) {
        String sql = "UPDATE libro SET isbn = ?, nombre = ?, autor = ?, editorial = ?, anioPublicacion = ?, clasificacion = ?, activo = ? WHERE idInventario = ?";
        try (Connection conn = conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, libro.getIsbn());
            ps.setString(2, libro.getNombre());
            ps.setString(3, libro.getAutor());
            ps.setString(4, libro.getEditorial());
            ps.setDate(5, new java.sql.Date(libro.getAnioPublicacion().getTime()));
            ps.setString(6, libro.getClasificacion());
            ps.setBoolean(7, libro.isActivo());
            ps.setInt(8, libro.getIdInventario());

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
