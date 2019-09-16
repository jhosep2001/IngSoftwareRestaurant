package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.usuarios.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Usuario> obtenerJefesDeCocina(){
        return  usuarios.stream().filter(usuario -> usuario instanceof JefeCocina).collect(Collectors.toList());
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void convertirClienteEnVip(Usuario cliente){
        for(int i = 0, n = usuarios.size(); i < n; i++) {
            if(usuarios.get(i).equals(cliente)){
                List<Beneficio> beneficios = new ArrayList<>(cliente.getBeneficios());
                cliente = new ClienteVip(cliente.getNombre(), cliente.getGenero(), cliente.getCorreo(), cliente.getContrasena());
                cliente.setBeneficios(beneficios);
                usuarios.set(i, cliente);
            }
        }
    }
}
