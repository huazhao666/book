package demo1;

import java.util.Scanner;

/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-10-27
 * Time : 23:01
 */
class  UseError extends Exception{
    public UseError(String message) {
        super(message);
    }
}
class PassWordError extends  Exception{
    public PassWordError(String message) {
        super(message);
    }
}
public class TestDmeo2 {
    private static  String useName = "shanshan";
    private static  String password = "5211314";
    public static void main (String[] args) {
        try {
            loginGame("shanshan","5211314");
        }catch (UseError useError){
            useError.printStackTrace();
        }catch (PassWordError passWordError){
            passWordError.printStackTrace();
        }
    }
    public static String use(String useName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String useName1 = sc.nextLine();
        return useName1;
    }
    public static String password(String password){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        String password1 = sc.nextLine();
        return password1;
    }
    public static  void loginGame(String useName,String password) throws UseError,PassWordError{
        if(!TestDmeo2.useName.equals(use(useName))){
            throw new UseError("用户名错误");
        }
        if(!TestDmeo2.password.equals(password(password))){
            throw new PassWordError("密码错误");
        }
        System.out.println("登录成功");
    }
}
