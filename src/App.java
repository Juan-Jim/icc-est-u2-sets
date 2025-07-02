
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {

        Sets sets = new Sets();
        runHashSet(sets);
        runLinKedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetConComparadorDecendente(sets);

    }
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
}