package co.edu.udem.dp.entities;

public class MesaIndividual extends Mesa {

    public MesaIndividual() {
        super();
    }

    public MesaIndividual(String id) {
        super(id);
        this.setCapacidadMax(1);
    }

    @Override
    public String toString(){
        return this.getId()+" Tipo Individual";
    }
}
