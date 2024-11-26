package src;

public class MaxAppearElement {

    private static void bruteForce(int[] a){

        int maxCount = 0;
        int maxCountElement = 0;
        for (int i = 0; i <a.length; i++) {
            int count = 0;
            for (int j = i; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                maxCountElement = a[i];
            }
        }
        System.out.println(" max appear element is " + maxCountElement + "  its count is " + maxCount );
    }



    public static void main(String[] args) {
        bruteForce(new int[]{1, 1, 2, 2, 2, 3, 4, 3});
    }
}
