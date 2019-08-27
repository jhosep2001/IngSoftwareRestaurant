package co.edu.udem.dp.main;

import co.edu.udem.dp.entities.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cocina extends JefeCocina {

    //Atributos para Mocks
    private static List<Cliente> clientes = new ArrayList<Cliente>();
    private static List<Mesa> mesas = new ArrayList<Mesa>();
    private static List<Reserva> reservas = new ArrayList<Reserva>();
    private GranChef granChef;

    public static void main (String[] args){

        //iniciamos los clientes
        crearCliente(new ClienteNormal("cliente"+(clientes.size()+1)));
        crearCliente(new ClienteNormal("cliente"+(clientes.size()+1)));
        crearCliente(new ClienteVip("cliente"+(clientes.size()+1)));
        crearCliente(new ClienteNormal("cliente"+(clientes.size()+1)));

        //iniciamos las mesas
        crearMesa(new MesaIndividual("mesa"+(mesas.size()+1)));
        crearMesa(new MesaIndividual("mesa"+(mesas.size()+1)));
        crearMesa(new MesaIndividual("mesa"+(mesas.size()+1)));
        crearMesa(new MesaGrupal("mesa"+(mesas.size()+1)));
        crearMesa(new MesaLounge("mesa"+(mesas.size()+1)));
        crearMesa(new MesaGrupal("mesa"+(mesas.size()+1)));
        crearMesa(new MesaPareja("mesa"+(mesas.size()+1)));
        crearMesa(new MesaPareja("mesa"+(mesas.size()+1)));

        //mostramos las listas
        System.out.println("Creado: ");
        System.out.println("Reservas: "+reservas.size());
        clientes.stream().forEach(cliente -> System.out.println(cliente.getName()));
        mesas.stream().forEach(mesa -> System.out.println(mesa.getId() +"-"+ (mesa.isDisponible()?"Disponible":"No disponible")));

        //Realizar una reserva.
        NuevaReserva(clientes.get(1), mesas.get(2), new MotivoReservaAniversario(), LocalDateTime.now().plusDays(5l).toString());
        NuevaReserva(clientes.get(3), new MesaPareja(), new MotivoReservaCumpleanos(), LocalDateTime.now().plusDays(9l).toString());

        //mostramos las listas
        System.out.println("\n //////////////////////////////////////////////// \n \n Reservas: "+reservas.size());
        mesas.stream().forEach(mesa -> System.out.println(mesa.getId() +"-"+ (mesa.isDisponible()?"Disponible":"No disponible")));

        //mostrar reservas
        reservas.stream().forEach(reserva -> System.out.println("Reserva de: "+reserva.getCliente().getName() +"," +
                " Mesa escogida: "+reserva.getMesa().toString()+" Fecha de uso: "+reserva.getFechaDeUso()));

    }

    public Cocina (){
        this.granChef = new GranChef();
    }

    private static void crearCliente(Cliente cliente){
        clientes.add(cliente);
    }

    private static void crearMesa(Mesa mesa){
        mesas.add(mesa);
    }

    private static void NuevaReserva(Cliente cliente, Mesa mesa, MotivoReserva motivoReserva, String fechaDeUso) {
        Reserva reserva = new Reserva();
        List<Mesa> mesaDisponible = mesas.stream().filter(mesa1 -> mesa1.isDisponible() && mesa1.getClass().equals(mesa.getClass()))
                .collect(Collectors.toList());
        if (mesaDisponible.size() != 0 ) {
            reserva.setCliente(cliente);
            reserva.setMesa(mesaDisponible.get(0));
            reserva.setMotivoReserva(motivoReserva);
            reserva.setValor(4000l);
            reserva.setFechaReserva(LocalDateTime.now().toString());
            reserva.setFechaDeUso(fechaDeUso);
            mesaDisponible.get(0).setDisponible(false);
            reservas.add(reserva);
        }
    }


}
