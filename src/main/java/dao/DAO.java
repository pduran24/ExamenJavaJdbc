package dao;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz genérica para los DAO (Data Access Object).
 * Define las operaciones básicas de acceso a datos.
 *
 * @param <T> Tipo de entidad que maneja el DAO.
 */
public interface DAO<T> {
    /**
     * Guarda una entidad en la base de datos.
     * @param t Entidad a guardar.
     * @return Entidad guardada envuelta en Optional, o vacío si no se pudo guardar.
     */
    Optional<T> save(T t);

    /**
     * Actualiza una entidad en la base de datos.
     * @param t Entidad a actualizar.
     * @return Entidad actualizada envuelta en Optional, o vacío si no se pudo actualizar.
     */
    Optional<T> updateGenero(T t);


    /**
     * Obtiene todas las entidades de la base de datos.
     * @return Lista de todas las entidades.
     */
    List<T> getAll();




}
