package org.experis.collections.bonus;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        // creo l' oggetto Scanner per leggere l'input dall'utente
        Scanner scanner = new Scanner(System.in);
        // chiedo all'utente di inserire una parola
        System.out.println("Inserisci la tua parola: ");
        // leggo la parola inserita dall'utente e rimuove eventuali spazi
        String word = scanner.nextLine().replaceAll(" ", "");

       // traccio il numero di occorrenze di ogni singolo carattere
        Map<Character, Integer> counter = new HashMap<>();

        // ciclo attraverso ogni carattere nella parola
        for (int i = 0; i < word.length(); i++) {
            // ottengo  il carattere corrente
            char character = word.charAt(i);
            // aggiorno la mappa incrementando il conteggio per il carattere corrente
            counter.put(character, counter.getOrDefault(character, 0) + 1);
        }

        // stampo il conteggio di ciascun carattere
        for(char character : counter.keySet()){
            System.out.println(character + ": " + counter.get(character));
        }

        // chiudo lo scanner
        scanner.close();
    }
}




