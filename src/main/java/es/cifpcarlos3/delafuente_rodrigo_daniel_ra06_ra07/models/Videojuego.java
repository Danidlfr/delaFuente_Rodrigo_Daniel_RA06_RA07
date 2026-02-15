package es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models;

import java.math.BigDecimal;

public class Videojuego {
    private int id;
    private String titulo;
    private String genero;
    private String plataforma;
    private Double precioReserva;
    private String imagen;

    public Videojuego(int id, String titulo, String genero, String plataforma, Double precioReserva, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precioReserva = precioReserva;
        this.imagen = imagen;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public String getPlataforma() { return plataforma; }
    public Double getPrecioReserva() { return precioReserva; }
    public String getImagen() { return imagen; }
}
