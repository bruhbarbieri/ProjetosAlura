package br.com.alura.screenmatch;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");

        nomes.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
