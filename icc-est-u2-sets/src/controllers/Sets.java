package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> contruirHashSet() {

        Set<String> palabras = new HashSet<>(); 
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> contruirLinkHashSet() {
        Set<String> palabras = new LinkedHashSet<>(); 
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> contruirTreeSet() {
        Set<String> palabras = new TreeSet<>(); 
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }

    public Set<String> contruirTreeSetConComparador() {

        Comparator<String> comparador = new Comparator<String>() {

            public int compare(String s1, String s2) {
                // Primero comparamos por la longitud
                int resultado = Integer.compare(s1.length(), s2.length());
                if (resultado == 0) {
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        }; 

        Set<String> palabras = new TreeSet<>(comparador); 
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;   
        
    }

    public Set<String> contruirTreeSetConComparadorDecendente() {

        Comparator<String> comparador = new Comparator<String>() {

            public int compare(String s1, String s2) {
                // Primero comparamos por la longitud
                int resultado = Integer.compare(s2.length(), s1.length());
                if (resultado == 0) {
                    resultado = s2.compareTo(s1);
                }
                return resultado;
            }
        }; 

        Set<String> palabras = new TreeSet<>(comparador); 
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        palabras.add("Celulas");
        return palabras;
    }
}