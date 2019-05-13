package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 带分数，能够实现，但是运行超时！！必须要优化
 * 取值的优化
 int sum(int start,int end)
 {
 int i,sum=0;
 for(i=start;i<end;i++)
 sum=sum*10+a[i+1];
 return sum;
 */
public class _04 {
    public static int total = 9;
    public static int count;
    public static int N;
    public static int[] result;
    public static boolean[] visit;
    public static int[] number = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        count = 0;
        result = new int[total];
        visit = new boolean[total];
        Arrays.fill(visit,true);
        dfs(0);
        System.out.println(count);
    }

    //dfs遍历1~9
    public static void dfs(int layer) {  //方法代表层数，循环代表存入入的数
        if(layer==total){
            //1到9，可以直接下标切割，不适用两位数但是在该题中可行。所以直接转为数组
            iscan(toString(result));
        }else {
            for(int i=0;i<total;i++){
                if(visit[i]){
                    visit[i] = false;
                    result[layer] = number[i];  //将第i个数放入第layer层中
                    dfs(layer+1);
                    visit[i] = true;
                }
            }
        }
    }

    //判断
    public static void iscan(String str) {
        int a;
        int b;
        int c;

        //循环+和/，判断是否成立。
        for(int i=1;i<7;i++){
            for(int j=i+1;j<total;j++){
                a = Integer.parseInt(str.substring(0,i));
                b = Integer.parseInt(str.substring(i,j));
                c = Integer.parseInt(str.substring(j,9));
                if(b==(N-a)*c){
                    System.out.println("a="+a+"  b="+b+"  c="+c);
                    count++;  //总数，条件成立的总数
                }
            }
        }
    }

    public static String toString(int[] result){
        StringBuffer SB = new StringBuffer();
        for (int i=0; i<total;i++){
            SB.append(result[i]);
        }
        return SB.toString();
    }

}
