package com.practice;

import java.util.Scanner;

/**
 * 取球游戏
 */
public class _13 {
    //1 3 7 8
    public static int[] temp = {1,3,7,8};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(chickBall(arr[i])) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static boolean chickBall(int num){
        //被迫拿最后一个，无失误，答案唯一。a和b两个人取。
        //情景模拟，a先拿，他会怎么考虑？如果只有一个，则被迫拿
        //boolean判断是a还是b
        if(num==1){
            return false;
        }
        //选择策略1：如果拿走之后只剩一个，那么就拿它
        //选择策略2：如果都不是，那该拿多少？拿递归后能够赢的那个
        //所以需要返回值，用返回值控制。双方都选最优解，其实这本质上就是一个简单的递归调用
        //前面的结果决定后面，递归。

        //递归，那么递归传递的值是什么？以及怎么调用。要倒过来想，先想少的时候
        //都是选择必赢的？假设都是选择最优的上一个输了这一个就赢了，所以是返回前一个的相反
        for(int i=0;i<4;i++){
            if(num>temp[i] && !chickBall(num-temp[i])) return true ;
        }
        return false;
    }
}
