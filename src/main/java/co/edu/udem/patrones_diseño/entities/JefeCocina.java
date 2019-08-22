package co.edu.udem.patrones_diseño.entities;

import java.util.ArrayList;
import java.util.List;

public class JefeCocina {

    private static List<Mesa> mesas = new ArrayList<Mesa>();
    private List<Reserva> reservas = new ArrayList<Reserva>();

    public JefeCocina() {
    }

    public void añadirMesa(Mesa mesa){
        mesas.add(mesa);
    }

    public void hacerReserva(Reserva reserva){
        reservas.add(reserva);
    }
}
