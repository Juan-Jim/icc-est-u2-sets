
import controllers.ContactoControler;
import controllers.Ejercicios;

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

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Ejercicio 1");
        boolean resultado1 = ejercicios.tieneDuplicados(new int[]{1, 2, 3, 4, 5});
        boolean resultado2 = ejercicios.tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45});
        System.out.println("Tiene duplicados? " + resultado1);
        System.out.println("Tiene duplicados? " + resultado2);

        System.out.println("Ejercicio 2");
        boolean isograma1 = ejercicios.esIsograma("murcielago");
        boolean isograma2 = ejercicios.esIsograma("camaleon");
        System.out.println("Es isograma? " + isograma1);
        System.out.println("Es isograma? " + isograma2);

        System.out.println("Ejercicio 3");
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades,
            la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados.
            ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana,
            personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta.
            El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        int cantidadPalabras = ejercicios.contarPalabras(texto);
        System.out.println("Cantidad de palabras únicas: " + cantidadPalabras);

        System.out.println("Ejercicio 4");
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
        ejercicios.compareTextos(texto1, texto2);
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