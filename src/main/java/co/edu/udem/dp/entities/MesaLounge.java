package co.edu.udem.dp.entities;

public class MesaLounge extends Mesa {

    public MesaLounge() {
        super();
    }

    public MesaLounge(String id) {
        super(id);
        this.setCapacidadMax(5);
    }

    @Override
    public String toString(){
        return this.getId()+" Tipo Lounge";
    }
}
