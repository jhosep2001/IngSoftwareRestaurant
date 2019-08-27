package co.edu.udem.dp.entities;

public class MesaGrupal extends Mesa {

    public MesaGrupal() {
        super();
    }

    public MesaGrupal(String id) {
        super(id);
        this.setCapacidadMax(10);
    }

    @Override
    public String toString(){
        return this.getId()+" Tipo Grupal";
    }
}
