package co.edu.udem.dp.servicios;

public class ServicioInventario {

    private ServicioIngrediente servicioIngrediente = new ServicioIngrediente();

    public ServicioIngrediente getServicioIngrediente() {
        return servicioIngrediente;
    }

    public void setServicioIngrediente(ServicioIngrediente servicioIngrediente) {
        this.servicioIngrediente = servicioIngrediente;
    }
}
