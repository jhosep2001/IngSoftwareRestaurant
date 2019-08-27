package co.edu.udem.dp.entities;

public class Reserva {

    private Cliente cliente;
    private Mesa mesa;
    private MotivoReserva motivoReserva;
    private JefeCocina jefeCocina;
    private Long valor;
    private String fechaReserva;
    private String fechaDeUso;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Mesa mesa, MotivoReserva motivoReserva, JefeCocina jefeCocina) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.motivoReserva = motivoReserva;
        this.jefeCocina = jefeCocina;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public MotivoReserva getMotivoReserva() {
        return motivoReserva;
    }

    public void setMotivoReserva(MotivoReserva motivoReserva) {
        this.motivoReserva = motivoReserva;
    }

    public JefeCocina getJefeCocina() {
        return jefeCocina;
    }

    public void setJefeCocina(JefeCocina jefeCocina) {
        this.jefeCocina = jefeCocina;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getFechaDeUso() {
        return fechaDeUso;
    }

    public void setFechaDeUso(String fechaDeUso) {
        this.fechaDeUso = fechaDeUso;
    }
}
