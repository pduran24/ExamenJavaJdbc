package database;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.util.logging.Logger;

/**
 * Gestor de la conexión a la base de datos.
 * Utiliza el patrón Singleton para asegurar una única instancia.
 */
public class DataProvider {

    private static Logger logger = Logger.getLogger(DataProvider.class.getName());

    private static DataSource dataSource;

    /**
     * Constructor privado para evitar instanciación externa (patrón Singleton).
     */
    private DataProvider() {}

    /**
     * Obtiene la instancia única del DataSource.
     * @return DataSource configurado para la conexión a la base de datos.
     */
    public static DataSource getDataSource() {

        if (dataSource == null) {
            logger.info("Iniciando DataProvider");
            var ds = new MysqlDataSource();

            ds.setUrl("jdbc:mysql://localhost:3307/examen_db");
            ds.setUser(System.getenv("USER_DB"));
            ds.setPassword(System.getenv("PASSWORD_DB"));

            try {
                ds.setAllowMultiQueries(true);
            } catch (Exception e) {
                logger.info("Error al configurar DataSource: " + e.getMessage());
                throw new RuntimeException(e);
            }

            dataSource = ds;
        }
        return dataSource;
    }
}
