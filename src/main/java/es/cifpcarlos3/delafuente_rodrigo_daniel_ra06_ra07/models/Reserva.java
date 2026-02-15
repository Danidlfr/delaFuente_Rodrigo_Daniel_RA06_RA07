package es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models;

import java.time.LocalDate;

public class Reserva {
    private int id;
    private int idUsuario;
    private int idJuego;
    private LocalDate fechaReserva;
    private String estado;

    public Reserva(int id, int idUsuario, int idJuego, LocalDate fechaReserva, String estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idJuego = idJuego;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
    }

    public int getId() { return id; }
    public int getIdUsuario() { return idUsuario; }
    public int getIdJuego() { return idJuego; }
    public LocalDate getFechaReserva() { return fechaReserva; }
    public String getEstado() { return estado; }
}
