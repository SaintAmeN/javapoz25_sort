package com.sda.sort;

import com.sda.sort.bubble.BubbleSort;
import com.sda.sort.counting.CountingSort;
import com.sda.sort.merge.MergeSort;
import com.sda.sort.quick.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] tablicaSorted = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] tablicaNotSorted = new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Integer[] tablicaNotSorted = new Integer[]{3, 7, 2, 28, 13, 14, 30};

        System.out.println("Sortujemy Not Sorted: ");
        System.out.println(Arrays.asList(tablicaNotSorted));
//        BubbleSort.sort(tablicaNotSorted); // n^2 = (n * (n-1))/2
//         O(n^2)
        // (~)((n * (n-1))/2)
//        CountingSort.sort(tablicaNotSorted, 10);
//        MergeSort.sort(tablicaNotSorted);
        QuickSort.sort(tablicaNotSorted);
        System.out.println(Arrays.asList(tablicaNotSorted));

//        System.out.println("Sortujemy Sorted: ");
//        System.out.println(Arrays.asList(tablicaSorted));
//        BubbleSort.sort(tablicaSorted);
//        System.out.println(Arrays.asList(tablicaSorted));
    }

}
