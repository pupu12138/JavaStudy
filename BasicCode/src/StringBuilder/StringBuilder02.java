package StringBuilder;

/**
 * @author WYZ
 * @creat 2021-06-08 20:47
 * public StringBuilder append(任意类型) 添加数据，并返回对象本身
 * public StringBuilder reverse() 返回相反的字符序列
 */
public class StringBuilder02 {
    public static void main(String[] args) {
//        创建对象
        StringBuilder sb = new StringBuilder();
//        public StringBuilder append(任意类型) 添加数据，并返回对象本身
//        StringBuilder sb2 = sb.append("hello");

//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb);
//        System.out.println(sb ==sb2);
//        返回值为true
 /*       sb.append("hello ");
          sb.append("world ");
          sb.append("100");
          System.out.println("sb:"+sb);
          结果 sb:hello world 100
 */
//        链式编程
        sb.append("hello  ").append("world ").append("100");
        System.out.println("sb:"+sb);
//        结果相同
//        public StringBuilder reverse() 返回相反的字符序列
        sb.reverse();
        System.out.println("sb:"+sb);
//        直接进行了反转

    }
}
