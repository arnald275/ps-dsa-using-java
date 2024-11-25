package src;

import java.util.Arrays;

public class DuplicateInArray {

    // O(n^2)
    private static void bruteForce(int[] a){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]) System.out.println("duplicate found : " + a[i]);
            }
        }
    }


    public static void usingSort(int[] a){
        Arrays.sort(a);
        for(int i=0; i<a.length-1 ; i++){
            if(a[i] == a[i+1]) System.out.println("duplicate found : " + a[i]);
        }
    }

    public static void main(String[] args) {
//        bruteForce(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
        usingSort(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
    }
}
