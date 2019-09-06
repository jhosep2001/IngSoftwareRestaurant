package co.edu.udem.dp.entities.motivosReservas;

import java.util.ArrayList;
import java.util.List;

public abstract class MotivoReserva{

    private String nombre;
    private List<Elemento> elementos = new ArrayList<>();

    public MotivoReserva(String nombre) {
        this.nombre = nombre;
    }

    public void anadirElemento(){
        elementos.add(Elemento.Cumpleanos);
        elementos.add(Elemento.Torta);
    }
}
