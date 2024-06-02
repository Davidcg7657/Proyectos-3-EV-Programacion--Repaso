import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public final class Agenda {

    private List<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public void addContacto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el nombre de contacto para añadir/modificar si ya existe: ");
        String nombre = scan.nextLine();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombreCompleto().equals(nombre)) {
                // Caso de q exista un contacto con ese nombre, modificamos el telefono
                System.out.println("Introduce el nuevo numero de telefono para añadir/modificar si ya existe: ");
                String nuevoTelefono = scan.nextLine();
                contactos.get(i).setTelefono(nuevoTelefono);

                return; // Si no lo ponemos se ejecuta el codigo de abajo q pondremos
            }
        }

        // Caso de que no exista un contacto con ese nombre, añadimos un nuevo contacto
        System.out.println("Introduce el numero de telefono: ");
        String telefono = scan.nextLine();
        Contacto contacto = new Contacto(nombre, telefono);
        contactos.add(contacto);
        System.out.println("Se ha añadido el nuevo contacto");

    }

    public void buscarContacto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombreCompleto().equals(nombre)) {
                System.out.println(contactos.get(i));
            }
        }
    }

    public void deleteContacto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombreCompleto().equals(nombre)) {
                contactos.remove(i);
                System.out.println("El contacto se ha borrado");
                return;
            }
        }
        System.out.println("El contacto no existe, no se ha borrado nada");
    }

    public void listar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Orden alfabetico ascendente.");
        System.out.println("2. Orden telefonico ascendente.");
        System.out.println("3. Orden telefonico descendente. (opcion por defecto)");
        System.out.println("Introduce la opcion de visualizacion para el listado");
        int opcion = Integer.parseInt(scan.nextLine());
        switch (opcion) {
            case 1: Collections.sort(contactos);
                    mostrarContactos();
                    break;
            case 2: Collections.sort(contactos, new TelefonoComparator());
                mostrarContactos();
                break;
            default: Collections.sort(contactos, new TelefonoComparator().reversed());
                mostrarContactos();
                break;
        }
    }

    public void mostrarContactos() {
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i));
        }
    }


    @Override
    public String toString() {
        return "Agenda{" +
                "contactos=" + contactos +
                '}';
    }
}
