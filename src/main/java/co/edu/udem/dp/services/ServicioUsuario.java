package co.edu.udem.dp.services;

import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.GranChef;
import co.edu.udem.dp.entities.usuarios.JefeCocina;
import co.edu.udem.dp.entities.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ServicioUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public ServicioUsuario(){}

    public void crearGranChef(String nombre, String correo, String contrasena){
        usuarios.add(new GranChef(nombre, correo, contrasena));
    }

    public void crearJefeCocina(String nombre, String correo, String contrasena){
        usuarios.add(new JefeCocina(nombre, correo, contrasena));
    }

    public void crearClienteNormal(String nombre, String correo, String contrasena){
        usuarios.add(new ClienteNormal(nombre, correo, contrasena));
    }

    public Usuario obtenerUsuarioPorNombre(String nombre){
        for (Usuario usuario : usuarios) {
            if (nombre.compareTo(usuario.getNombre()) == 0) {
                return usuario;
            }
        }
        return null;
    }
}
