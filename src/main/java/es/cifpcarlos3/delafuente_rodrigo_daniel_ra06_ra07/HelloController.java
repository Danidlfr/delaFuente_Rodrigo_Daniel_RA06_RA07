package es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07;

import es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models.Reserva;
import es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models.Usuario;
import es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models.Videojuego;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {


    @FXML
    protected void onHelloButtonClick() {
        Videojuego videojuego = new Videojuego(1, "Resident Evil 9", "Accion" ,"PS5", "69.99", "portada.png");
        Usuario user = new Usuario(1, "Manolo", "manolo@gmail.com", "manoloPsswd");
        Reserva reserva = new Reserva(1, 1, 1, "10/07/2993", "A la venta");
    }
}
