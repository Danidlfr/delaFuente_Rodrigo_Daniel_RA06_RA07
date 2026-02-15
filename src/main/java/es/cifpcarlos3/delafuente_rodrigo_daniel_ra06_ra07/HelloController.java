package es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07;

import es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models.Reserva;
import es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models.Usuario;
import es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models.Videojuego;
import javafx.fxml.FXML;


public class HelloController {

    @FXML
    protected void onHelloButtonClick() {
        Videojuego videojuego = new Videojuego(1, "Hytale", "Aventura", "PC", 20.43,"portada.jpg");
        Usuario user = new Usuario(1, "pablito", "pablito@hotmail.com", "pablitoPasswd");
        Reserva reserva = new Reserva(1, 1, 1, "21/01/2026", "Sin stock");
    }
}
