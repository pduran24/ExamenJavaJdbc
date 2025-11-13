import dao.PeliculaDAO;
import database.DataProvider;
import models.Pelicula;
import utils.PeliculasUtils;

import javax.sql.DataSource;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        DataSource ds = DataProvider.getDataSource();
        PeliculaDAO pdao = new PeliculaDAO(ds);

        /*
        Pelicula pelicula = new Pelicula("Pelicula A", "Aventura", 2006);
        pdao.save(pelicula);

         */



        System.out.println("Tamaño de la lista: "+PeliculasUtils.tamanioPeliculas(pdao.getAll()));

        List<Pelicula> peliculas = pdao.getByGenero("aventura");
        System.out.println(pdao.updateGenero(peliculas, "Genero A"));
    }
}
