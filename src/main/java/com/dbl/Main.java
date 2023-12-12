package com.dbl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(
                1, 2, 3, 4, 5, 6, 7, 8
        );

        List<Integer> result = numeros.stream()
                .map(numero -> {
                    if (numero % 2 == 0) {
                        return (numero * numero) + 1;
                    } else {
                        return numero * numero;
                    }
                }).toList();

        result.forEach(System.out::println);

        System.out.println(result.stream()
                .filter(it -> it % 2 != 0)
                .count());

        System.out.println("Max : " +
                result.stream().max(Integer::compareTo).get());
        System.out.println("Min : " +
                result.stream().min(Integer::compareTo).get());


    }
}