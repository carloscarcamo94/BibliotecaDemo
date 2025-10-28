package com.BibliotecaDemo.services;

import java.util.List;
import com.BibliotecaDemo.models.Libro;

/**
 * Interfaz ILibro
 * Define las operaciones CRUD para la entidad Libro.
 */
public interface ILibro {

    /**
     * Guarda un nuevo libro en la base de datos.
     * @param libro Objeto Libro a guardar.
     * @return true si se guardó correctamente, false si ocurrió un error.
     */
    boolean guardar(Libro libro);

    /**
     * Recupera un libro por su ID.
     * @param idInventario Identificador del libro.
     * @return Objeto Libro si existe, o null si no se encontró.
     */
    Libro recuperarPorId(int idInventario);

    /**
     * Modifica la información de un libro existente.
     * @param libro Objeto Libro con los datos actualizados.
     * @return true si se modificó correctamente, false si ocurrió un error.
     */
    boolean modificar(Libro libro);

    /**
     * Elimina un libro de la base de datos según su ID.
     * @param idInventario Identificador del libro a eliminar.
     * @return true si se eliminó correctamente, false si ocurrió un error.
     */
    boolean borrar(int idInventario);

    /**
     * Obtiene la lista completa de libros registrados.
     * @return Lista de objetos Libro.
     */
    List<Libro> listarLibros();
}
