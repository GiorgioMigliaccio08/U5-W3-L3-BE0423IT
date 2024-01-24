package giorgiomigliaccio.U5W3L3.entities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
public class Runner {
    @Override
    public void run(String... args) throws Exception {
        UserData user = new UserData("admin@gmail.com", "1234", "ADMIN");



        // Creo la catena scegliendo l'ordine dei filtri

        credentialsCheckerFilter.setNextFilter(roleCheckerFilter);
        roleCheckerFilter.setNextFilter(loggerFilter);

        // Faccio partire la catena dal primo
        credentialsCheckerFilter.check(user);

    }
}
