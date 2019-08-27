package co.edu.udem.dp.entities;

public abstract class Mesa {

    private String id;
    private int capacidadMax;
    private boolean disponible;

    public Mesa() {
    }

    public Mesa(String id) {
        this.id = id;
        this.disponible = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
