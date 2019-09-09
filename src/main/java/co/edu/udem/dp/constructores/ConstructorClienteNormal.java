package co.edu.udem.dp.constructores;

import co.edu.udem.dp.entities.usuarios.Beneficio;
import co.edu.udem.dp.entities.usuarios.ClienteNormal;

import java.util.ArrayList;
import java.util.List;

public class ConstructorClienteNormal {
    private String nombre = "Elma";
    private String genero = "Femenino";
    private String correo = "Elma@mut.com";
    private String contrasena = "Elmamut";
    private List<Beneficio> beneficios = new ArrayList<>();

    public ConstructorClienteNormal (){}

    public ConstructorClienteNormal nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public ConstructorClienteNormal femenino(){
        this.genero = "Femenino";
        return this;
    }

    public ConstructorClienteNormal masculino(){
        this.genero = "Masculino";
        return this;
    }

    public ConstructorClienteNormal correo(String correo){
        this.correo = correo;
        return this;
    }

    public ConstructorClienteNormal contrasena(String contrasena){
        this.contrasena = contrasena;
        return this;
    }

    public ConstructorClienteNormal agregarBeneficio(Beneficio beneficio){
        this.beneficios.add(beneficio);
        return this;
    }

    public ClienteNormal construir(){
        ClienteNormal clienteNormal = new ClienteNormal(this.nombre, this.genero, this.correo, this.contrasena);
        clienteNormal.setBeneficios(beneficios);
        return clienteNormal;
    }
}
