package co.edu.udem.dp.entities;

public class MesaPareja extends Mesa {

    public MesaPareja() {
        super();
    }

    public MesaPareja(String id) {
        super(id);
        this.setCapacidadMax(2);
    }

    @Override
    public String toString(){
        return this.getId()+" Tipo Pareja";
    }
}
