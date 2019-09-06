package co.edu.udem.dp.entities;

import co.edu.udem.dp.entities.mesas.Mesa;
import co.edu.udem.dp.entities.motivosReservas.MotivoReserva;
import co.edu.udem.dp.entities.usuarios.Usuario;
import co.edu.udem.dp.fabricas.FabricaMotivoReserva;

public class Reserva {

    private Usuario usuario;
    private Mesa mesa;
    private MotivoReserva motivoReserva;
    private Long valor;
    private String fechaReserva;
    private String fechaDeUso;

    public Reserva() {
    }

    public Reserva(Usuario usuario, Mesa mesa, MotivoReserva motivoReserva, String fechaDeUso) {
        this.usuario = usuario;
        this.mesa = mesa;
        this.motivoReserva = motivoReserva;
        this.fechaDeUso = fechaDeUso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
