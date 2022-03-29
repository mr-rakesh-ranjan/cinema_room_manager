import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++){
            a[i] =  sc.nextInt();
        }
        for (int i = 0; i <  3; i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (a[i] < b[j]){
                    System.out.println("Box 1 < Box 2");
                } else {
                    System.out.println("Box1 > Box 2");
                }
            }
        }
    }
}