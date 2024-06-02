import java.util.Comparator;

public class TelefonoComparator implements Comparator<Contacto> {
    @Override
    public int compare(Contacto contacto1, Contacto contacto2) {
        return contacto1.getTelefono().compareTo(contacto2.getTelefono());
    }

    @Override
    public Comparator<Contacto> reversed() {
        return Comparator.super.reversed();
    }
}
