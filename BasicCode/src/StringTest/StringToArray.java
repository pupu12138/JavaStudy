package StringTest;

/**
 * @author WYZ
 * @creat 2021-06-07 17:08
 * 需求：拼接字符串
 */
public class StringToArray {
    public static void main(String[] args) {
//        定义一个数组，使用静态初始化初始
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println("s" + s);
    }

    //    定义一个方法，要求将int数组转换为String返回
/*    返回值类型：string
       参数int[] arr
 */
    public static String arrayToString(int[] arr) {

        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ", ";
            }
        }
        s += "]";
        return s;

    }
}
