package com.sda.sort.quick;

public class QuickSort {
    private static int licznikInstrukcji = 0;

    public static void sort(Integer[] tablica) {
        licznikInstrukcji = 0;
        quickSort(tablica, 0, tablica.length - 1);
        System.out.println("Ilość instrukcji: " + licznikInstrukcji);
    }

    private static void quickSort(Integer[] tablica, int początek, int koniec) {
        if(początek == koniec){
            return;
        }
        int indexPivot = (początek + koniec) / 2; // znalezienie środka

        int pivot = tablica[indexPivot];
        System.out.println("Pivot: " + pivot);
        int indeksLewa = początek;
        int indeksPrawa = koniec;

        do {
            // dopóki element jest MNIEJSZY od pivot (szukam większego)

            while (tablica[indeksLewa] < pivot) { // szukamy elementu większego
                licznikInstrukcji++;
//                if(tablica[indeksLewa] < pivot) {
                indeksLewa++;
//                }
            }

            // dopóki element jest WIĘKSZY od pivot (szukam mniejszego)
            while (tablica[indeksPrawa] > pivot) {
                licznikInstrukcji++;
//                if((tablica[indeksPrawa] > pivot)) {
                indeksPrawa--;
//                }
            }
            if (indeksLewa <= indeksPrawa) { // jeśli strzałki nam się nie skrzyżowały
                int tmp = tablica[indeksLewa];
                tablica[indeksLewa] = tablica[indeksPrawa];
                tablica[indeksPrawa] = tmp;
                indeksPrawa--;
                indeksLewa++;
            }
            licznikInstrukcji++;
        } while (indeksLewa <= indeksPrawa);

        if (początek < indeksPrawa) {
            quickSort(tablica, początek, indexPivot);
        }

        if (indeksLewa > koniec) {
            quickSort(tablica, indexPivot, koniec);
        }
    }
}
