package com.dsa.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 9, 17, 22, 34, 41, 46};
        int target = 4;

        int ans = search(arr, 0, arr.length - 1, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int start, int end, int target) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] < target) {
            return search(arr, mid + 1, end, target);
        }
        return search(arr, start, mid - 1, target);
    }
}
