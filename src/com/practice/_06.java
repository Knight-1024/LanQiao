package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * DFS全排列
 * Created by CHX on 2019/3/24.
 */
public class _06 {
        private static int [] result;//存放全排列的结果
        private static boolean [] visit;//定义一个标记数组
        private static int total; //全排列的长度

        private static void dfs(int count){
            if(count==total){
                System.out.println(Arrays.toString(result));
                //return;
            }
            for(int i=0;i<total;i++){
                if(visit[i]){
                    visit[i] = false;
                    result[count] = i;
                    dfs(count+1);
                    visit[i] = true;
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            total = sc.nextInt();
            result = new int[total];
            visit = new boolean[total];
            Arrays.fill(visit,true);
            dfs(0);
        }
    }
