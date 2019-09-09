package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.usuarios.ClienteNormal;
import co.edu.udem.dp.entities.usuarios.GranChef;
import co.edu.udem.dp.entities.usuarios.JefeCocina;
import co.edu.udem.dp.entities.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ServicioUsuario {

    private List<Usuario> usuarios = new ArrayList<>();

    public ServicioUsuario(){}

    public void agregarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Usuario obtenerUsuarioPorNombre(String nombre){
        for (Usuario usuario : usuarios) {
            if (nombre.compareTo(usuario.getNombre()) == 0) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
