package giorgiomigliaccio.U5W3L3.entities;

public class Logger extends Filter {
    @Override
    public void check(UserData user) {
        System.out.println("Ciao sono il logger");
        System.out.println("Ho ricevuto il seguente utente: ");
        System.out.println(user);
        this.wait(user);
    }
}
