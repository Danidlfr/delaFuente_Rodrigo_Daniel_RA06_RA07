package es.cifpcarlos3.delafuente_rodrigo_daniel_ra06_ra07.models;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String contrasenia;

    public Usuario(int id, String nombre, String email, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public String getContrasenia() { return contrasenia; }
}
