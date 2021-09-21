package methodTest1;

import java.util.Scanner;

/**
 * @author WYZ
 * @creat 2021-05-20 9:49
 */
public class methodTestTry2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n,m);
    }
    public static void print(int n,int m){
        for (int i = n; i < m; i++) {
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}
