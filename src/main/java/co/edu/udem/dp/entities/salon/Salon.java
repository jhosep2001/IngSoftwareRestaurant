package co.edu.udem.dp.entities.salon;

import co.edu.udem.dp.entities.Reservable;
import co.edu.udem.dp.entities.mesas.Mesa;

import java.util.List;

public class Salon implements Reservable {
    private List<Mesa> mesas;

    public Salon(){}

    public Salon(List<Mesa> mesas){
        this.mesas = mesas;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }
}
