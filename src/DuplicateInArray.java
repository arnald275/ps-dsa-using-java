package src;

public class DuplicateInArray {

    private static void bruteForce(int[] a){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]) System.out.println("duplicate found : " + a[i]);
            }
        }
    }

    public static void main(String[] args) {
        bruteForce(new int[]{1, 1, 3, 4, 5, 6, 6, 9, 3});
    }
}
