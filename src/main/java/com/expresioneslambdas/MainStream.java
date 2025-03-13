package com.expresioneslambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {
public static void main(String[] args) {
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Crear un Stream, filtrar números pares y recolectar en una lista
List<Integer> pares = numeros.stream()
.filter(n -> n % 2 == 0)
.collect(Collectors.toList());
System.out.println("Números pares: " + pares);
// Crear un Stream, mapear a sus cuadrados y recolectar en una lista
List<Integer> cuadrados = numeros.stream()
.map(n -> n * n)
.collect(Collectors.toList());
System.out.println("Cuadrados de los números: " + cuadrados);
// Crear un Stream, filtrar números mayores que 5, mapear a sus cuadrados y recolectar en una lista

List<Integer> cuadradosMayoresQue5 = numeros.stream()
.filter(n -> n > 5)
.map(n -> n * n)
.collect(Collectors.toList());
System.out.println("Cuadrados de números mayores que 5: " +
cuadradosMayoresQue5);
}
}
