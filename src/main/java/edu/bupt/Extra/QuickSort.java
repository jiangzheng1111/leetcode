package edu.bupt.Extra;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 7, 9, 4, 8, 6, 0};
        System.out.println("排序前的数组为：" + Arrays.toString(arr));
        quickSort(arr, 0, 9);
        System.out.println("排序后的数组为：" + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

    private static int partition(int[] arr, int l, int r) {
        int pi = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] < pi) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, r);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
