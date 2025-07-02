
import controllers.ContactoControler;
import java.util.Set;
import models.Contacto;
public class App {
    public static void main(String[] args) throws Exception {

        //Sets sets = new Sets();
        //runHashSet(sets);
        //runLinKedHashSet(sets);
        //runTreeSet(sets);
        //runTreeSetConComparador(sets);
        //runTreeSetConComparadorDecendente(sets);

        ContactoControler controler = new ContactoControler();
        imprimirAgendaPorNombre(controler);
        imprimirAgendaPorTelefono(controler);
        imprimirAgendaPorHash(controler);
    }

    public static void imprimirAgendaPorNombre(ContactoControler controler) {
        System.out.println("Agenda ordenada por Apellido - Nombre");
        Set<Contacto> agendaNombre = controler.getAgendaNombre();
        for (Contacto c : agendaNombre) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }

    public static void imprimirAgendaPorTelefono(ContactoControler controler) {
        System.out.println("\nAgenda ordenada por Apellido - Nombre - Telefono");
        Set<Contacto> agendaTelefono = controler.getAgendaTelefono();
        for (Contacto c : agendaTelefono) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }

   public static void imprimirAgendaPorHash(ContactoControler controler) {
        System.out.println(" ");
        System.out.println("Agenda ordenada por HASHCODE");
        Set<Contacto> agendaHash = controler.getAgendaPorHash();
        for (Contacto c : agendaHash) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getTelefono());
        }
    }

    /* 
        public static void runHashSet(Sets sets) {
            System.out.println("==== HashSet ====");
            for (String palabra: sets.contruirHashSet()) {
                System.out.println(palabra);
        }

    }
        public static void runLinKedHashSet(Sets sets) {
            System.out.println("==== LinkedHashSet ====");
                for (String palabra: sets.contruirLinkHashSet()) {
                    System.out.println(palabra);
         }    
    }

    public static void runTreeSet(Sets sets) {
            System.out.println("==== TreeSet ====");
                for (String palabra: sets.contruirTreeSet()) {
                    System.out.println(palabra);
         }    
    }

    public static void runTreeSetConComparador(Sets sets) {
            System.out.println("==== TreeSetConComparador ====");
                    for (String palabra: sets.contruirTreeSetConComparador()) {
                    System.out.println(palabra);
         }    
    }

    public static void runTreeSetConComparadorDecendente(Sets sets) {
            System.out.println("==== TreeSetConComparadorDesedente ====");
                    for (String palabra: sets.contruirTreeSetConComparadorDecendente()) {
                    System.out.println(palabra);
         }    
    }
    */
    
    

    
}