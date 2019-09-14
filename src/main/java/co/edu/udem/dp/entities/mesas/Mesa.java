package co.edu.udem.dp.entities.mesas;

import co.edu.udem.dp.entities.Reservable;

public abstract class Mesa implements Reservable {

    private int capacidad;

    public Mesa(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
