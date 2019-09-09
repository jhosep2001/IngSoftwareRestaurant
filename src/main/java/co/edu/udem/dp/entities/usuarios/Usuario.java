package co.edu.udem.dp.entities.usuarios;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {

    private String nombre;

    private String genero;

    private String correo;

    private String contrasena;

    private List<Beneficio> beneficios;

    public Usuario(String nombre, String genero, String correo, String contrasena) {
        this.nombre = nombre;
        this.genero = genero;
        this.correo = correo;
        this.contrasena = contrasena;
        beneficios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }
}
