import java.util.Objects;

public final class Contacto implements Comparable<Contacto> {

    private String nombreCompleto;
    private String telefono;


    public Contacto(String nombreCompleto, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombreCompleto, contacto.nombreCompleto) && Objects.equals(telefono, contacto.telefono);
    }

    @Override
    public int compareTo(Contacto otro) {
        return this.nombreCompleto.compareTo(otro.nombreCompleto);
    }

    @Override
    public String toString() {
        return "Nombre de contacto: " + nombreCompleto + " Telefono: " + telefono;
    }
}
