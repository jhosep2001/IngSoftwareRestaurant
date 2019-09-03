package co.edu.udem.dp.entities.motivosReservas;

import java.util.ArrayList;
import java.util.List;

public class MotivoReserva{

    private String nombre;
    private List<Elemento> elementos = new ArrayList<>();

    public MotivoReserva(String nombre) {
        this.nombre = nombre;
        añadirElemento();
    }

    private void añadirElemento(){
        switch (this.nombre.toLowerCase()){
            case "aniversario":
                break;
            case "bienvenida":
                break;
            case "despedida":
                elementos.add(Elemento.Romantica);
                break;
            case "cumpleaños":
                elementos.add(Elemento.Cumpleanos);
                break;
            default:
                // añadir elemento dinamicamente
        }
        elementos.add(Elemento.Torta);
    }
}
