package com.sda.sort.bubble;

import java.util.Arrays;

public class BubbleSort {
    /**
     * procedure bubbleSort( A : lista elementów do posortowania )
     * n = liczba_elementów(A)
     * do
     * for (i = 0; i < n-1; i++) do:
     * if A[i] > A[i+1] then
     * swap(A[i], A[i+1])
     * end if
     * end for
     * n = n-1
     * while n > 1
     * end procedure
     */
    public static void sort(Integer[] tablica) {
        int licznikInstrukcji = 0;

        int n = tablica.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                licznikInstrukcji++;
                if (tablica[i] > tablica[i + 1]) {
                    // swap
                    int tmp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = tmp;
                }
            }

            System.out.println("Iteracja: " + (tablica.length - n) + " " + Arrays.asList(tablica));
            n--;
        } while (n > 1);

        System.out.println("Ilość instrukcji: " + licznikInstrukcji);
    }
}
