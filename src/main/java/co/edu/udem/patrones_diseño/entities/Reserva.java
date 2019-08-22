package co.edu.udem.patrones_diseño.entities;

public class Reserva {

    private Cliente cliente;
    private Mesa mesa;
    private MotivoReserva motivoReserva;
    private JefeCocina jefeCocina;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Mesa mesa, MotivoReserva motivoReserva, JefeCocina jefeCocina) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.motivoReserva = motivoReserva;
        this.jefeCocina = jefeCocina;
    }
}
