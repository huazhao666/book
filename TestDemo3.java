package demo1;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-29
 * Time : 19:27
 */
public class TestDemo3 {
    public static void main (String[] args){
        String str = "avecefewfew";
//        System.out.println(myIndexOf(str,'e',3));
//        System.out.println(myContains(str,"abc"));
//        System.out.println(myComepareTo(str,"avecefewfew"));
//        System.out.println(myComepareTo(str,"sahdsh"));
        System.out.println(myComepareTo(str,"abeceedwder"));
        //System.out.println((int)str.charAt(0) - (int)str.charAt(1));
    }
    //自己的indexo方法
    public static int  myIndexOf(String str,char x,int t){
        for (int i = t; i < str.length(); i++) {
           char n = str.charAt(i);
           if(n == x){
               return i;
           }
        }
        return -1;
    }
    public static boolean myContains(String str ,String s){
        int n = s.length();
        for (int i = 0; i < str.length() - n ; i++) {
            if(str.substring(i,i + n).equals(s)){
                return true;
            }
        }
        return false;
    }
    public static int myComepareTo(String str,String str1){
        if(str.length() == str1.length()){
            char v1[] = str.toCharArray();
            char v2[] = str1.toCharArray();
            int k = 0;
            while (k < str.length()) {
                char c1 = v1[k];
                char c2 = v2[k];
                if (c1 != c2) {
                    return c1 - c2;
                }
                k++;
            }
        }
        return  str.length() - str1.length();
    }
    public  static  int myComepareTo1(String str,String s){
        if(str.length() == s.length()){
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i) == s.charAt(i)){
                    return  0;
                }else {
                    int n = (int)str.charAt(i) - (int)s.charAt(i);
                    return n;
                }
            }
        }

        return  str.length() - s.length();
    }
}
