package com.cafintech.linertable;

/**
 * Created by 15600 on 2017/12/6.
 * 数组相关知识
 */
public class ArrayTest {

    public static void copyArray(){
        int []oldArray={1,2,3,4,5,6,7,8,9,10};
        int []newArray=new int[20];
        System.arraycopy(oldArray,0,newArray,0,oldArray.length);
        oldArray=newArray;
        for(int i=0;i<20;i++){
            System.out.println(oldArray[i]);
        }
    }//实现数组拷贝

    public static void addElement(int index,int e){
    }
    public static void main(String[] args) {
        copyArray();
    }
}
