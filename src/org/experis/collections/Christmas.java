package org.experis.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        // creo un oggetto Scanner per leggere l'input dall'utente
        Scanner scanner = new Scanner(System.in);
        // creo un'ArrayList per memorizzare i regali
        ArrayList<String> listGifts = new ArrayList<>();

        // creo una variabile booleana per controllare se l'utente desidera continuare ad inserire regali
        boolean continua = true;
        // creo un ciclo while finché l'utente desidera continuare
        while(continua){
            // chiedo all'utente di inserire un regalo
            System.out.println("Inserisci il tuo regalo: ");
            String gift = scanner.nextLine();

            // aggiungo il regalo alla lista
            listGifts.add(gift);

            // ad ogni iterazione stampo la lunghezza della lista
            System.out.println("Finora hai inserito: " + listGifts.size() + " regali ");

            System.out.println("-----------------------------");

            // chiedo all'utente se vuole aggiungere altri regali
            System.out.println("Vuoi aggiungere altri regali? (sì/no): ");
            String answer = scanner.nextLine();
            // verifico se l'utente ha risposto 'no', in tal caso esco dal ciclo
            if(!answer.equalsIgnoreCase("sì")){
                continua = false;
            }
        }

        // ordino la lista in ordine alfabetico
        Collections.sort(listGifts);

        // stampo la lista dei regali ordinati
        for(String gift : listGifts){
            System.out.println(gift);
        }
        // stampo il numero totale di regali inseriti
        System.out.println("Ecco i tuoi: " + listGifts.size() + " regali ");

        // chiudo lo scanner
        scanner.close();
    }
}

