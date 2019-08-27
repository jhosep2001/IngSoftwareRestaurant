package co.edu.udem.dp.entities;

public class ClienteNormal extends Cliente {

    public ClienteNormal(String name) {
        super(name);
    }

    @Override
    public Long pagar(Reserva reserva) {
        return null;
    }
}
