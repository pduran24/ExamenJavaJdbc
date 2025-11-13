package dao;

import models.Pelicula;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class PeliculaDAO implements DAO<Pelicula> {

    private static Logger logger =  Logger.getLogger(PeliculaDAO.class.getName());
    private DataSource ds;

    public PeliculaDAO(DataSource ds) {
        this.ds = ds;
    }

    private Pelicula mapper(java.sql.ResultSet rs) throws java.sql.SQLException {
        return new Pelicula(
                rs.getInt("id"),
                rs.getString("titulo"),
                rs.getString("genero"),
                rs.getInt("año")
        );
    }

    @Override
    public Optional<Pelicula> save(Pelicula pelicula) {
        logger.info("PeliculaDAO save");
        final String sql = "INSERT INTO pelicula (titulo, genero, año) VALUES (?, ?, ?)";

        try (Connection conn = ds.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, pelicula.getTitulo());
            pstmt.setString(2, pelicula.getGenero());
            pstmt.setInt(3, pelicula.getAnio());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                logger.info("Pelicula guardada correctamente");
                return Optional.of(pelicula);
            } else {
                logger.warning("No se pudo guardar la pelicula");
            }
        } catch (Exception e) {
            logger.severe("Error al guardar la pelicula: " + e.getMessage());
        }

        return Optional.empty();
    }

    @Override
    public List<Pelicula> getAll() {
        logger.info("PeliculaDAO getAll");
        final String sql = "SELECT * FROM pelicula";

        try (Connection conn = ds.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             java.sql.ResultSet rs = pstmt.executeQuery())
        {
            List<Pelicula> productos = new java.util.ArrayList<>();
            while (rs.next()) {
                productos.add(mapper(rs));
            }
            logger.info("Peliculas obtenidass correctamente");
            return productos;
        } catch (Exception e) {
            logger.severe("Error al obtener lass peliculas: " + e.getMessage());
        }

        return new ArrayList<>();
    }

    @Override
    public List<Pelicula> getByGenero(String genero) {
        logger.info("PeliculaDAO getByGenero");
        final String sql = "SELECT * FROM pelicula WHERE genero = ?";
        List<Pelicula> peliculasPorGenero = new ArrayList<>();

        try (Connection conn = ds.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, genero);

            try (java.sql.ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    peliculasPorGenero.add(mapper(rs));
                }
            }

            logger.info("Peliculas obtenidas correctamente para el género: " + genero);
            return peliculasPorGenero;

        } catch (Exception e) {
            logger.severe("Error al obtener las películas por género (" + genero + "): " + e.getMessage());
        }

        return new ArrayList<>();
    }


    @Override
    public List<Pelicula> updateGenero(List<Pelicula> peliculas, String genero) {
        logger.info("PeliculaDAO updateGenero");
        final String sql = "UPDATE pelicula SET genero = ? where genero = ?";
        String genero2 = peliculas.get(0).getGenero();

        try (Connection conn = ds.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {
            pstmt.setString(1, genero);
            pstmt.setString(1, genero2);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                logger.info("Pelicula actualizado correctamente");
                return peliculas;
            } else {
                logger.warning("No se pudo actualizar la pelicula");
            }
        } catch (Exception e) {
            logger.severe("Error al actualizar la pelicula: " + e.getMessage());
        }
        return new  ArrayList<>();
    }
}
