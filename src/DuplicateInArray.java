package src;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateInArray {

    // O(n^2)
    private static void bruteForce(int[] a){
        System.out.println("\t brute force solution \n");
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]) System.out.println("duplicate found : " + a[i]);
            }
        }
    }


    public static void usingSort(int[] a){
        System.out.println("\t with sorting \n");
        Arrays.sort(a);
        for(int i=0; i<a.length-1 ; i++){
            if(a[i] == a[i+1]) System.out.println("duplicate found : " + a[i]);
        }
    }

    public static void withOutSortUsingHashSet(int[] a){
        System.out.println("\t without sorting \n");
        HashSet<Integer> set = new HashSet<>();
        for (int e : a) {
            if (set.contains(e)) {
                System.out.println("duplicate found : " + e);
            } else {
                set.add(e);
            }
        }
    }


    // if range of input is known and should be in 0 to n
    // basically hashing based on index
    public static void usingCountArray(int[] a, int n){
        System.out.println("\t using count array \n");
        int[] count = new int[n + 1];
        for(int i=0; i<a.length; i++){
            if(count[ a[i] ] >= 1){
                System.out.println("duplicate found : " + a[i]);
            }
            count[a[i]]++;
        }

    }

    public static void firstDuplicateElement(int[] a){
        System.out.println("\t floyd's cycle detection \n");

        int tortoise = a[0];
        int hare = a[0];

        do{
            tortoise = a[tortoise];
            hare = a[ a[hare] ];
        }while (tortoise != hare);

        tortoise = a[0];
        while (tortoise != hare){
            tortoise = a[tortoise];
            hare = a[hare];
        }

        System.out.println("first duplicate element is : " + hare);
    }

    public static void main(String[] args) {
        bruteForce(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
        usingSort(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
        withOutSortUsingHashSet(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
        usingCountArray(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3},9); // 9 is n (max range)
        firstDuplicateElement(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
    }
}
