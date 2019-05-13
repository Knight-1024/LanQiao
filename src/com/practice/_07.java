package com.practice;

import java.util.Arrays;

/**
 * dfs  记忆、理解、使用
 * 先记住，然后多使用，在这同时慢慢理解。
 */
public class _07 {
    public static int[] number;
    public static int[] result;
    public static boolean[] visit;  //true为可访问
    public static int total;

    /**
     * dfs
     * @param count  递归到第几个
     */
    public static void dfs(int count){  //确定第几位
        //跳出
        if(count==total){
            System.out.println(Arrays.toString(result));
            return;
        }

        //遍历：循环+递归调用，以visit作判断回滚
        for(int i=0;i<total;i++){  //确定该位取第几个值
            if(visit[i]){
                visit[i] = false;
                //下面就体现出了第几位取第几个值，所以result以count为下标，number取第i个
                result[count] = number[i];
                dfs(count+1);  //下一位
                visit[i] = true;  //回滚
            }
        }
    }

    public static void main(String[] args) {
        total = 5;
        number = new int[]{1,3,5,7,9};
        result = new int[total];
        visit = new boolean[total];
        Arrays.fill(visit,true);
        dfs(0);
    }

}