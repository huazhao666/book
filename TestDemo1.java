package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-27
 * Time : 20:07
 */
public class TestDemo1 {
    //将字符串逆置；
//    public static void main1 (String[] args){
//        String ret = reverse("abcdef",0,1);
//        String ret2 = reverse(ret,2,ret.length() - 1);
//        System.out.println(reverse(ret2,0,ret2.length() - 1));
//    }
//    public static  String reverse (String str,int left,int right){
//        char[] array = str.toCharArray();
//        char tmp ;
//        while (left < right){
//            tmp = array[left];
//            array[left] = array[right];
//            array[right] = tmp;
//            left++;
//            right--;
//        }
//        return new String(array);
//    }

}
//逆置任意位置的字符串（abcdef --> cdefab）
class Solution {
    public static String reverse2(String str,int i,int j) {
        if(str == null) return null;
        //1、先把字符串转变为数组
        char[] array = str.toCharArray();
        //2、开始逆置
        while (i < j) {
            char tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        return String.copyValueOf(array);
    }
    public  static String reverseLeftWords(String str, int k) {
        if(str == null) return null;
        int len = str.length();
        if(len == 0 || k <= 0 || k > len) {
            return null;
        }
        str = reverse2(str,0,k-1);//bacdef
        str = reverse2(str,k,len-1);//bafedc
        str = reverse2(str,0,len-1);//efab;
        return str;
    }
    public static void main (String[] args){
        String str = "abcdef";
        System.out.println(reverseLeftWords(str, 2));
    }
}

