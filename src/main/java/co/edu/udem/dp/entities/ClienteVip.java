package co.edu.udem.dp.entities;

public class ClienteVip extends Cliente {

    public ClienteVip(String name) {
        super(name);
    }

    @Override
    public Long pagar(Reserva reserva) {
        return null;
    }
}
