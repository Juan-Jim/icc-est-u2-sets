# Práctica 4: Árbol Binario 

- **Título:** Práctica de sets
- **Asignatura:** Estructura de Datos  
- **Carrera:** Computación  
- **Estudiante:** Juan Jimenez  
- **Fecha:** 1/07/2025  
- **Profesor:** Ing. Pablo Torres  

## Descripción

Esta práctica implementa y compara el uso de las principales clases de la interfaz Set en Java: HashSet, LinkedHashSet, TreeSet y TreeSet con Comparator. Se demuestra cómo se comportan con respecto al almacenamiento, ordenamiento y eliminación de duplicados. Además, se personaliza el orden de los elementos en TreeSet mediante comparadores propios, tanto en orden ascendente como descendente, utilizando criterios como la longitud de las cadenas.

## Estructura del Proyecto

- Sets.java: Clase que contiene métodos para construir e inicializar diferentes tipos de Set con ejemplos de inserción de datos y comparaciones personalizadas.

## Funcionalidades Principales

- HashSet:

    - No garantiza orden de inserción.

    - Elimina duplicados automáticamente.

- LinkedHashSet:

    - Mantiene el orden de inserción de los elementos.

     -Elimina duplicados automáticamente.

- TreeSet:

    - Ordena automáticamente los elementos en orden natural (alfabético en este caso).

    - No permite elementos duplicados.

- TreeSet con Comparator personalizado:

    - Permite ordenar los elementos por longitud y, en caso de igualdad, por orden alfabético.

    - TreeSet con Comparator personalizado descendente:

    - Ordena las cadenas de mayor a menor longitud.

    -En caso de empate, las ordena alfabéticamente en orden descendente.

## Ejemplo de Ejecución

- Cada método de la clase Sets construye un conjunto diferente:

    - contruirHashSet(): Devuelve el conjunto sin un orden específico.

    - contruirLinkHashSet(): Devuelve el conjunto respetando el orden de inserción.

    - contruirTreeSet(): Devuelve el conjunto ordenado alfabéticamente.

    - contruirTreeSetConComparador(): Ordena las palabras por longitud ascendente y alfabéticamente si tienen la misma longitud.

    - contruirTreeSetConComparadorDecendente(): Ordena las palabras por longitud descendente y luego alfabéticamente en orden inverso.

## Notas
- Los conjuntos Set eliminan automáticamente los elementos duplicados.

- El uso de Comparator en TreeSet permite personalizar completamente la lógica de ordenamiento.

- Esta práctica refuerza el conocimiento sobre estructuras de datos no lineales y cómo influye el tipo de implementación en el comportamiento del programa

## Captura

![Captura de pantalla 2025-07-01 195525](https://github.com/user-attachments/assets/ae4980bb-9636-41bb-b77b-ca944ef87ec7)
