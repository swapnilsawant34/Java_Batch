package com.arrays;

import java.util.Arrays;

class Arrayslice {

    public static int[] getSliceOfArray(int[] arr, int start, int end) {
        int[] slice = new int[end - start];
        for (int i = 0; i < slice.length;i++) {
            slice[i] = arr[start + i];
        }
        return slice;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 2, end = 4;

        int[] slice = getSliceOfArray(arr, start, end + 1);

        System.out.println(Arrays.toString(slice));
    }
}
