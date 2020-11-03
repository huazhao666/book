package demo1;

import java.util.*;


/**
 * Created with Intellij IFEA
 * Description:
 * User : 花朝
 * Date : 2020-11-03
 * Time : 16:08
 */
public class TestDemo4 {
    //逆波兰表达式
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
           int op1;
           int op2;
        for (String s: tokens) {
                switch (s){
                    case "+":
                        op2 = stack.pop();
                        op1 = stack.pop();
                        stack.push(op1 + op2);
                        break;
                    case "-":
                        op2 = stack.pop();
                        op1 = stack.pop();
                        stack.push(op1 - op2);
                        break;
                    case "*":
                        op2 = stack.pop();
                        op1 = stack.pop();
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        op2 = stack.pop();
                        op1 = stack.pop();
                        stack.push(op1 / op2);
                        break;
                    default:
                        stack.push(Integer.valueOf(s));
                        break;
                }
        }
            return stack.pop();
    }
    //删除最外面的括号
    public  static String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int level = 0;
        for (char c : S.toCharArray()) {
            if (c == ')') --level;
            if (level >= 1) sb.append(c);
            if (c == '(') ++level;
        }
        return sb.toString();
    }
    public static void main (String[] args){
        String  s = "(()()())(())(()())";
       String ret = removeOuterParentheses(s);
        System.out.println(ret);
    }
}
//二维网格迁移
class Solution2 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        for (int i = 0; i < k; i++) {//移动k次；
            for (int i1 = 0; i1 < grid.length; i1++) { //i1代表grid的每个元素
                int temp = grid[i1][grid[0].length-1];//这是每个元素里面的最后一个元素
                for (int i2 = grid[0].length - 1; i2 >= 1; i2--){ //每个元素的内部的元素循环（倒续）
                    grid[i1][i2] = grid[i1][i2-1];//把每个元素的内部元素后移一位；
                }
                grid[i1][0]=temp;// 下一行的初始位置是前一行的最后一个元素
            }
            int temp2 = grid[grid.length-1][0];//这是该数组的最后一个元素；
            for (int j = grid.length-1; j >=1; j--) {
                grid[j][0] = grid[j-1][0];//把每一列的元素向下移动
            }
            grid[0][0]=temp2;//把最后一个元素移到第一个元素；
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : grid) { //遍历新的数组
            List<Integer> list = new ArrayList<>();
            lists.add(list);
            for (int anInt : ints) {
                list.add(anInt);
            }
        }
        return lists;
    }
}