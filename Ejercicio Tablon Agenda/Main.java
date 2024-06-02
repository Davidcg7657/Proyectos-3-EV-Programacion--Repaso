import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        * Escribir un programa que implemente una agenda.
        * En la agenda se podrán guardar nombres y números de teléfono.
        * El programa nos dará el siguiente menú:
        * Añadir/modificar: Nos pide un nombre.
        * Si el nombre se encuentra en la agenda,
        * debe mostrar el teléfono y, opcionalmente,
        * permitir modificarlo.
        * Si el nombre no se encuentra,
        * debe permitir ingresar el teléfono correspondiente
        * al nombre que se ha buscado.
        * Buscar: Nos pide una cadena de caracteres, y nos muestra todos los contactos cuyos nombres comiencen por dicha cadena.
        * Borrar: Nos pide un nombre y si existe nos preguntará si queremos borrarlo de la agenda. Dará error si no existe.
        * Listar: Nos muestra todos los contactos de la agenda junto con sus números.
        * Implementar el programa con un diccionario,
        * así como varias formas de visualización para la opción de Listar.
        */

        Contacto c1 = new Contacto("Jorge Muñoz Morera", "+34587412458");
        Contacto c2 = new Contacto("Alba Molina Rodriguez", "+34954785324");
        Contacto c3 = new Contacto("Mario Molina Rodriguez", "+34954785324");
        Contacto c4 = new Contacto("Jorge Muñoz Morera", "+40587412458");
        List<Contacto> listaPrueba = new ArrayList<>();
        listaPrueba.add(c1);
        listaPrueba.add(c2);
        listaPrueba.add(c3);
//        System.out.println(c1.compareTo(c2));
//        System.out.println(c2.compareTo(c2));
//        System.out.println(c2.equals(c3));
        System.out.println(listaPrueba);
        Collections.sort(listaPrueba);
        System.out.println(listaPrueba);
        // Creacion de agenda
        Agenda miAgenda = new Agenda();
//        System.out.println(miAgenda);
//        miAgenda.setContactos(listaPrueba);
        System.out.println("*******AGENDA*******");
//        System.out.println(miAgenda);
//        miAgenda.deleteContacto();
//        miAgenda.buscarContacto();
//        System.out.println();
//        System.out.println(miAgenda);
//        Collections.sort(listaPrueba, new TelefonoComparator());
//        System.out.println(listaPrueba);
//        Collections.sort(listaPrueba, new TelefonoComparator().reversed());
//        System.out.println(listaPrueba);
        System.out.println("*******PRUEBAS DE LISTADO*******");
        miAgenda.mostrarContactos();
        miAgenda.listar();
        miAgenda.listar();
        miAgenda.listar();
        System.out.println(miAgenda);


    }

}