package com.cafintech.wzz;

import java.util.Stack;

/**
 * Created by 15600 on 2017/12/5.
 * 栈应用解决括号匹配问题
 */
public class StackAlgo {
    public static boolean isMatch(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }//如果是[或者（就放入堆栈中
            if(s.charAt(i)==')'){
                if(!(stack.isEmpty())&&stack.pop()=='('){
                    continue;
                }else {
                    return false;
                }
            }
            if(s.charAt(i)==']'){
                if(!(stack.isEmpty())&&stack.pop()=='['){
                    continue;
                }else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(2);
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
    }
}
