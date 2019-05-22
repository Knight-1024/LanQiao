package com.practice;

import java.util.Scanner;

/**
 * 取球游戏
 * Created by CHX on 2019/3/26.
 */
public class _07 {

    //可取球数
    public static int[] temp = {1,3,7,8};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if(chickBall(arr[i])){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean chickBall(int num){
        //被迫拿最后一个
        if(num==1){
            return false;
        }

        //选择策略
        for(int i=0;i<4;i++){
            if(num>temp[i] && !chickBall(num-temp[i])) return true ;
        }
        return false;
    }
}
