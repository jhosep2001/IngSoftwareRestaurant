package co.edu.udem.dp.entities;

public abstract class Cliente {

    private String name;

    public Cliente() {

    }

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Long pagar(Reserva reserva);
}
