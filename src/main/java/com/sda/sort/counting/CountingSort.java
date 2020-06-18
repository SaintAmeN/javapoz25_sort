package com.sda.sort.counting;

public class CountingSort {
    /**
     * Musimy znać zakres liczbowy.
     * Zakładamy, że nie ma liczb ujemnych.
     */
    public static void sort(Integer[] tablica, int maksymalnaWartosc) {
        // domyślnie jest to tablica ZER (0)
        int[] liczniki = new int[maksymalnaWartosc + 1];
        int licznikInstrukcji = 0;

        for (int i = 0; i < tablica.length; i++) { // ??? ile operacji ??? = n operacji
            int wartosc = tablica[i];
            liczniki[wartosc]++;
            licznikInstrukcji++;
        }

        int pozycjaWstawiania = 0;
        for (int wartoscDoWstawienia = 0; wartoscDoWstawienia < liczniki.length; wartoscDoWstawienia++) { // n
            int iloscLiczbTejWartosciDoWstawienia = liczniki[wartoscDoWstawienia]; // zliczamy plusiki
            for (int i = 0; i <  iloscLiczbTejWartosciDoWstawienia; i++) {
                tablica[pozycjaWstawiania++] = wartoscDoWstawienia;
                licznikInstrukcji++;
            }
        }
        // (~)(2 * n)
        // O(n)
        System.out.println("Ilość instrukcji: " + licznikInstrukcji);
    }
}
