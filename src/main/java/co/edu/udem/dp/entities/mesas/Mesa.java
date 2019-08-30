package co.edu.udem.dp.entities.mesas;

public abstract class Mesa {

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
