package DeBugtest;

/**
 * @author WYZ
 * @creat 2021-05-19 19:10
 * ��1-5֮���ż����
 */
public class DebugTest2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=5 ; i++) {
            if (i%2==0){
                /*i += sum;��Ч��i=i+sum*/
                sum +=i;/* sum= sum+i*/
            }
        }System.out.println(sum);
    }
}
