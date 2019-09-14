package co.edu.udem.dp.servicios;

import co.edu.udem.dp.entities.salon.Salon;

import java.util.ArrayList;
import java.util.List;

public class ServicioSalon {
    private List<Salon> salones = new ArrayList<>();

    public ServicioSalon(){}

    public void agregarSalon(Salon salon){
        this.salones.add(salon);
    }

    public List<Salon> getSalones() {
        return salones;
    }
}
