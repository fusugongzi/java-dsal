package com.cafintech.wzz;

/**
 * Created by 15600 on 2017/12/5.
 */
public class QuickSort {
    static int AdjustArray(int s[],int l,int r){
        int i=l,j=r,x=s[i];
        while (i<j){
            //从右往左找比x小的数字
            while(i<j&&s[j]>=x){
                j--;
            }
            if(i<j){
                s[i]=s[j];
            }
            //从左往右找比x大的数字
            while(i<j&&s[i]<=x){
                i++;
            }
            if(i<j){
                s[j]=s[i];
            }
        }
        s[i]=x;
        return i;
    }

    static void quick_sort1(int s[], int l, int r)
    {
        if (l < r)
        {
            int i = AdjustArray(s, l, r);//先成挖坑填数法调整s[]
            quick_sort1(s, l, i - 1); // 递归调用
            quick_sort1(s, i + 1, r);
        }
    }

    public static void main(String[] args) {
        int []a={2,4,3,5,8,0};
        quick_sort1(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
