package demo1;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created with Intellij IFEA
 * Description:字符串的操作
 * User : 花朝
 * Date : 2020-10-27
 * Time : 15:33
 */
public class TestDemo {
    //
    //其他操作；
    public static void main11 (String[] args){
//        String str = " hellobit wordahhhh   ";
//        System.out.println(str.trim());//删除两边空格，保留中间空格；
//        System.out.println(str.toUpperCase());//转大写
//        System.out.println(str.toLowerCase());//转小写
//        System.out.println(str.length());//字符串长度
//        System.out.println(str.isEmpty());//判断字符串是否为空
        StringBuffer sb = new StringBuffer("hellobit wordahhhh");//单线程不安全
        StringBuilder sb1 = new StringBuilder("hengac");//多线程安全
        System.out.println(sb.append("45664543"));//直接添加
        System.out.println(sb.reverse());//逆转
        System.out.println(sb.replace(2,5,"1111"));//替换
        System.out.println(sb.delete(2,4));//删除
        System.out.println(sb.insert(2,"2"));//插入
        System.out.println(sb.toString());//转化为String；
//        String str1 = str.concat("234");//字符串连接 等同于+
//        System.out.println(str1);
    }


    //字符串截取；
    public static void main10 (String[] args){
        String str = "hello bit java";
        System.out.println(str.substring(5));//从5到结束；
        System.out.println(str.substring(0,5));//左闭右开；
    }
    //字符串拆分；
    public static void main9 (String[] args){
        String str = "hello bit java";
        String[] ret = str.split(" ",1); //以空格拆分为x个部分（可以默认分配，不规定分为多少部分）；
        for (String s : ret) {
            System.out.println(s);
        }
        String str2 = "hello.bit.java";
        String[] ret2 = str2.split(" \\.");  //转义（| ，* ， +）前面都要加上\  ；
            for (String s : ret2) {
                 System.out.println(s);      
            }
        String str3 = "java30-split#bit";
        String[] ret3 = str3.split(" |-|#");  //用| 隔开 和 - 还有#；前面必须要价格空格；
        for (String s: ret3) {
            System.out.println(s);
        }
        String str4 = "name=zhangsan&age=18"; //先用&分割，在用= 分割；
        String[] ret4 = str4.split("&");
        for (String s4: ret4) {
            String[] ret5 = s4.split("=");
            for (String s5:ret5) {
                System.out.println(s5);
            }
        }
    }
    //字符串的查找以及替换；
    public static void main8 (String[] args){
        String str = "hellobitbitbitabcd";
        System.out.println(str.contains("bit"));//查看是否有bit；
//        System.out.println(str.indexOf("bit")); //找到第一次出现bit 的下标；
//        System.out.println(str.indexOf("bit", 4));//从四号位置开始找第一次出现的bit；
//        System.out.println(str.lastIndexOf("bit")); //从后往前找；
//        System.out.println(str.lastIndexOf("bit",8)); //从某个位置开始，从后往前找；
//        System.out.println(str.startsWith("hel"));  //判断是否从“xxx”开头的
//        System.out.println(str.startsWith("hel",2));  //从x号位置开始找，判断是否从“xxx”开头的
//        System.out.println(str.endsWith("abcd"));//判断是不是xxx结尾的；
       System.out.println(str.replace("it","xx"));   //将所有的it都替换为xx；
    }

    public static void main (String[] args){
        String str = "12334aF";
        String str2 = "12334aB";
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));// 忽略大小写比较；

        int ret = str.compareTo(str2);   //str小的话，返回小于0的数字；str大的话，返回大于0的数；相等就返回0;
        System.out.println(ret);
    }
    //判断字符串是不是数字；
    public static boolean isNumberChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main6 (String[] args){
//        String str = "12345";
//        System.out.println(isNumberChar(str));
//        byte[] bytes = {97,98,99,100};
//        String str = new String(bytes);
//        System.out.println(str);
//        String str = "abcde";
//        byte[] bytes = str.getBytes();
//        System.out.println(Arrays.toString(bytes));

    }
    //字符数组转化为字符串
    public static void main5 (String[] args){
        char[] array = {'a','b','c'};
        String str = new String(array,0,2);//偏移量为0，打印两个
        System.out.println(str);

        String str2 = "abcdef";
        char ch = str2.charAt(0);
        System.out.println(ch);//拿到字符串0下标的位置
        System.out.println(str2.length());
        //字符串转化为字符数组；
        char[] array2 = str2.toCharArray();
        System.out.println(Arrays.toString(array2));
    }
    public static void main4 (String[] args) throws NoSuchFieldException,IllegalAccessException{
        String str = "hello";
        Class cl = String.class ;
        Field filed = cl.getDeclaredField("value");
        filed.setAccessible(true);
        char[] value = (char[]) filed.get(str);
        value[0] = 'H';
        System.out.println(str);

    }
    public static void main3 (String[] args){
        String str1 = "hello";
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);

    }

    public static void main2 (String[] args){
        String str1 = new String("HELLO").intern();
        String str2 = "HELLO";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
//
//        String str3 = "he" + "llo";
//        System.out.println(str1 == str3);
//
//        String str4 = "he";
//        String str5 = str4 + "llo";//"hell0"
//        System.out.println(str1 == str5);
//
//        String str6 = new String("he") + "llo";
//        System.out.println(str6 == str1);
//
//    }
//    public static void main1 (String[] args){
//        String str1 = "hello";
//
//        String str2 = new String("hello");
//
//        char[] array = {'h','e','l','l','0'};
//        String str3 = new String(array);
     }
}
