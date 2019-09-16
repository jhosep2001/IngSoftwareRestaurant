package co.edu.udem.dp.main;

import co.edu.udem.dp.constructores.ConstructorClienteNormal;
import co.edu.udem.dp.constructores.ConstructorRestaurante;
import co.edu.udem.dp.entities.Plato;
import co.edu.udem.dp.entities.Receta;
import co.edu.udem.dp.entities.Restaurante;
import co.edu.udem.dp.entities.ingrediente.*;
import co.edu.udem.dp.entities.mesas.Mesa;
import co.edu.udem.dp.entities.motivosReservas.Elemento;
import co.edu.udem.dp.entities.salon.Salon;
import co.edu.udem.dp.entities.usuarios.*;
import co.edu.udem.dp.fabricas.FabricaConstructorIngrediente;
import co.edu.udem.dp.fabricas.FabricaMesa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Mocks {

    Mocks(){}

    void crearMocksDeRestaurantes(NegocioController negocio){
        for(int i = 0; i < 3; i++){
            JefeCocina jefeCocina = (JefeCocina) negocio.getServicioUsuario().obtenerJefesDeCocina().get(i);
            Restaurante restaurante = new ConstructorRestaurante()
                    .direccion("direccion" + i)
                    .especialidad("especialidad" + i)
                    .telefono("654321" + i)
                    .jefeCocina(jefeCocina)
                    .construir();
            RestauranteController restauranteController = new RestauranteController(restaurante);
            crearMocksDeMesas(restauranteController);
            crearMocksDeSalones(restauranteController);
            crearMocksDeIngredientes(restauranteController);
            crearMocksDePedidos(restauranteController);
            negocio.getServicioRestaurante().crearRestaurante(restauranteController);
        }
    }

    private void crearMocksDeMesas(RestauranteController restaurante){
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            int capacidadEntreUnoYSeis = r.nextInt(6) + 1;
            restaurante.getServicioMesa().anadirMesaConCapacidad(capacidadEntreUnoYSeis);
        }
        for (int i = 0; i < 5; i ++){
            int capacidadEntreUnoYSeis = r.nextInt(6) + 1;
            restaurante.getServicioMesa().anadirMesaLoungeConCapacidad(capacidadEntreUnoYSeis);
        }
    }

    private void crearMocksDeSalones(RestauranteController restaurante){
        List<Mesa> mesas = new ArrayList<>();
        Random r = new Random();
        for(int i = 0 ; i < 3; i++){
            int capacidadEntreUnoYSeis = r.nextInt(6) + 1;
            mesas.add(FabricaMesa.crearMesaConCapacidad(capacidadEntreUnoYSeis));
        }
        mesas.add(FabricaMesa.crearMesaLoungeConCapacidad(r.nextInt(6)+ 1));
        restaurante.getServicioSalon().agregarSalon(new Salon(mesas));
    }

    private void crearMocksDeIngredientes(RestauranteController restaurante){
        FabricaConstructorIngrediente fabrica = new FabricaConstructorIngrediente();
        restaurante.getServicioInventario().getServicioIngrediente().añadirIngrediente(crearCarneRes(fabrica));
        restaurante.getServicioInventario().getServicioIngrediente().añadirIngrediente(crearCarneCerdo(fabrica));
        restaurante.getServicioInventario().getServicioIngrediente().añadirIngrediente(crearCarnePollo(fabrica));
        restaurante.getServicioInventario().getServicioIngrediente().añadirIngrediente(crearLiquido(fabrica));
        restaurante.getServicioInventario().getServicioIngrediente().añadirIngrediente(crearSolidoContable(fabrica));
        restaurante.getServicioInventario().getServicioIngrediente().añadirIngrediente(crearSolidoNoContable(fabrica));
    }

    private void crearMocksDePedidos(RestauranteController restaurante){
        List<Receta> recetas = crearRecetas(restaurante.getServicioInventario().getServicioIngrediente().getIngredientes());
        for(int i = 0, n = recetas.size(); i < n ; i++){
            restaurante.getServicioPedido().crearPlato(new Plato(recetas.get(i), 10000L));
        }
    }

    void crearMocksDeUsuarios(NegocioController negocio){
        for(int i = 0; i < 20; i++){
            Usuario clienteNormal = (i % 2 == 0) ? crearClienteMasculino(i) : crearClienteFemenino(i);
            negocio.getServicioUsuario().agregarUsuario(clienteNormal);
        }
        for (int i = 0; i < 3; i++){
            Usuario jefeCocina = new JefeCocina("jefeCocina"+i, "masculino", "jcCorreo" +i, "jcContrasena"+i);
            negocio.getServicioUsuario().agregarUsuario(jefeCocina);
        }
        Usuario granChef = new GranChef("granChef", "femenino", "gcCorreo", "gcContrasena");
        negocio.getServicioUsuario().agregarUsuario(granChef);
    }

    private ClienteNormal crearClienteMasculino(int i){
        return new ConstructorClienteNormal()
                .nombre("cliente" + i)
                .correo("correo" + i)
                .contrasena("contrasena" + i)
                .agregarBeneficio(Beneficio.PRIORIDAD)
                .masculino()
                .construir();
    }

    private ClienteNormal crearClienteFemenino(int i){
        return new ConstructorClienteNormal()
                .nombre("cliente" + i)
                .correo("correo" + i)
                .contrasena("contrasena" + i)
                .agregarBeneficio(Beneficio.PRIORIDAD)
                .femenino()
                .construir();
    }

    private Ingrediente crearCarneRes(FabricaConstructorIngrediente fabricaConstructorIngrediente){
        return fabricaConstructorIngrediente.constructorCarne().cantidad(1000).elementoComida(ElementoComida.CARNE).tipo(TipoCarne.RES).parte("Solomo").unidadMedida("gr").construir();
    }

    private Ingrediente crearCarneCerdo(FabricaConstructorIngrediente fabricaConstructorIngrediente){
        return fabricaConstructorIngrediente.constructorCarne().cantidad(1000).elementoComida(ElementoComida.CARNE).tipo(TipoCarne.CERDO).parte("Oreja").unidadMedida("gr").construir();
    }

    private Ingrediente crearCarnePollo(FabricaConstructorIngrediente fabricaConstructorIngrediente){
        return fabricaConstructorIngrediente.constructorCarne().cantidad(1000).elementoComida(ElementoComida.CARNE).tipo(TipoCarne.POLLO).parte("Pechuga").unidadMedida("gr").construir();
    }

    private Ingrediente crearLiquido(FabricaConstructorIngrediente fabricaConstructorIngrediente){
        return fabricaConstructorIngrediente.constructorLiquido().cantidad(1000).elementoComida(ElementoComida.ACEITE).unidadMedida("ml").construir();
    }

    private Ingrediente crearSolidoNoContable(FabricaConstructorIngrediente fabricaConstructorIngrediente){
        return fabricaConstructorIngrediente.constructorSolidoNoContable().cantidad(1000).elementoComida(ElementoComida.PIMIENTA).unidadMedida("gr").construir();
    }

    private Ingrediente crearSolidoContable(FabricaConstructorIngrediente fabricaConstructorIngrediente){
        return fabricaConstructorIngrediente.constructorSolidoContable().elementoComida(ElementoComida.MANZANA).cantidad(10).construir();
    }

    private List<Receta> crearRecetas(List<Ingrediente> ingredientes){
        List<Receta> recetas = new ArrayList<>();
        for(int i = 0, n = ingredientes.size(); i < n; i++){
            Receta receta = new Receta();
            receta.setNombre("receta"+i);
            long cantidad = ingredientes.get(i) instanceof SolidoContable ? 1 : 10;
            receta.getIngredientes().put(ingredientes.get(i), cantidad);
            recetas.add(receta);
        }
        return recetas;
    }
}
