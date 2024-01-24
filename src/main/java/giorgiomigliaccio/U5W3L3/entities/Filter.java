package giorgiomigliaccio.U5W3L3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Filter {
    private Filter nextFilter;

    public void check(UserData user) // Ogni filtro che estende questa classe poi implementerà la sua logica di controlli qua dentro
    {

    }

    public void next(UserData user) {
        if (this.nextFilter != null) { // Se true non siamo gli ultimi della catena
            this.nextFilter.check(user);
        } else {
            System.out.println("Siamo arrivati alla fine della catena!");
        }
    }
}
