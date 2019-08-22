package co.edu.udem.patrones_diseño.main;

import co.edu.udem.patrones_diseño.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private static List<Cliente> clientes = new ArrayList<Cliente>();
    private static List<JefeCocina> jefesCocina = new ArrayList<JefeCocina>();
    private GranChef granChef;

    public static void main (String[] args){
        crearCliente(new ClienteNormal());
    }

    public Cocina (){
        this.granChef = new GranChef();
    }

    private static void crearCliente(Cliente cliente){
        clientes.add(cliente);
    }

    private static void contratarJefeCocina(JefeCocina jefeCocina){
        jefesCocina.add(jefeCocina);
    }
}
