
package controllers;

import java.util.HashSet;
import java.util.Set;

public  class Ejercicios {

    public Ejercicios() {
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));

        System.out.println("Ejercicio 2");
        System.out.println(esIsograma("murcielago"));
        System.out.println(esIsograma("camaleon"));
        
    }        

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> numDuplicados = new HashSet<>();
        for (int numero : numeros) {
            if (!numDuplicados.add(numero)) {
                return true; 
            }
        }
        return false;
    }
    
    public boolean esIsograma(String palabra) {
        Set<Character> letras = new HashSet<>();
        for (char letra : palabra.toCharArray()) {
            if (!letras.add(letra)) {
                return false; 
            }
        }
        return true;
    }
     
    public int contarPalabras(String texto) {
        Set<String> palabrasUnicas = new HashSet<>();
        String[] palabras = texto.split(" ");
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                palabrasUnicas.add(palabra);
            }
            
        }
        return palabrasUnicas.size();       
    }
        
   

    

    public boolean isIsogram(String palabra) {
        Set<Character> palabras = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!palabras.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase) {
        Set<String> palabras = new HashSet<>();
        String[] palabrasArray = frase.split(" ");
        for (String palabra : palabrasArray) {
            palabras.add(palabra);
        }

        return palabras.size();
    }

    public void compararTextos(String texto1, String texto2) {
        Set<String> palabrasTexto1 = new HashSet<>();
        Set<String> palabrasTexto2 = new HashSet<>();

        for (String palabra : texto1.split(" ")) {
            palabrasTexto1.add(palabra);

        }

        for (String palabra : texto2.split(" ")) {
            palabrasTexto2.add(palabra);
        }

        Set<String> interseccion = new HashSet<>(palabrasTexto1);
        interseccion.retainAll(palabrasTexto2);

        System.out.println("Texto 1: " + contarPalabrasUnicas(texto1) + " palabras únicas");
        System.out.println("Texto 2: " + contarPalabrasUnicas(texto2) + " palabras únicas");
        
        System.out.println("Palabras comunes: " + interseccion.size());

        System.out.println("Concidencia léxica: " + (interseccion.size() * 100 / Math.min(palabrasTexto1.size(), palabrasTexto2.size())) + "%");
        System.out.println("Palabras comunes 1: "+ interseccion);
        System.out.println("Palabras comunes 2: " + interseccion);

    }
    
}