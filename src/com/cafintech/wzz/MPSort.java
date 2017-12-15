package com.cafintech.wzz;

/**
 * Created by 15600 on 2017/12/5.
 * 冒泡排序
 */
public class MPSort {
    public static void main(String[] args) {
        int []a={2,4,3,5,8,0};
        for(int end=a.length-1;end>0;end--){
            for(int j=0;j<end;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }

        for(int i=0;i<6;i++){
            System.out.println(a[i]);
        }


    }
}
