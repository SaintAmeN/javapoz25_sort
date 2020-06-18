package com.sda.sort.merge;

import java.util.Arrays;

public class MergeSort {
    private static int licznikInstrukcji = 0;

    // merge sort jest rekurencyjny
    // algorytm rekurencyjny musi mieć warunek końca
    public static void sort(Integer[] tablica) {
        licznikInstrukcji = 0;
        podziel(tablica, 0, tablica.length - 1);
        System.out.println("Ilość instrukcji: " + licznikInstrukcji);
    }

    private static void podziel(Integer[] tablica, int poczatek, int koniec) {
        if (poczatek == koniec) { // jest to tablica jednoelementowa (rozważamy jeden element)
            return; // to zawróć (nie idź bardziej w głąb)
        }

        int srodek = (poczatek + koniec) / 2; // 10 => (0 + 9)/2 = 4
        podziel(tablica, poczatek, srodek);                 // lewa połowa
        podziel(tablica, srodek + 1, koniec);       // prawa połowa

        merge(tablica, poczatek, srodek, koniec);
    }

    private static void merge(Integer[] tablica, int poczatek, int srodek, int koniec) {
        Integer[] kopia = Arrays.copyOf(tablica, tablica.length);

        int indexLewa = poczatek;
        int indexPrawa = srodek + 1;

        int pozycjaWstawiania = poczatek;

        // (indexLewa <= srodek) - dopóki mamy coś w lewej tablicy
        // (indexPrawa <= koniec) - dopóki mamy coś w prawej tablicy
        while ((indexLewa <= srodek) && (indexPrawa <= koniec)) {
            licznikInstrukcji++;
            if (kopia[indexLewa] < kopia[indexPrawa]) {
                tablica[pozycjaWstawiania++] = kopia[indexLewa++];  // rosnąco w górę
            } else if (kopia[indexLewa] > kopia[indexPrawa]) {
                tablica[pozycjaWstawiania++] = kopia[indexPrawa++];  // rosnąco w górę
            }
        }
        // jeśli jest coś jeszcze z lewej, to przepisz
        while (indexLewa <= srodek) {
            licznikInstrukcji++;
            tablica[pozycjaWstawiania++] = kopia[indexLewa++];  // rosnąco w górę
        }
        while (indexPrawa <= koniec) {
            licznikInstrukcji++;
            tablica[pozycjaWstawiania++] = kopia[indexPrawa++];  // rosnąco w górę
        }
    }
}
