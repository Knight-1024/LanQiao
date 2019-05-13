package com.practice;

public class _05 {

    private static int[] num = new int[10];
    private static boolean[] visit = new boolean[10];
    private static int ans = 0;

    public static void print(){
        for(int i : num){
            System.out.printf("%d",i);
        }
        ans++;
        System.out.println();
    }
    public static void dfs(int i){
        if(i == 9){
            print();
            return;
        }

        for (int index = 1; index < visit.length; index++){
            if(visit[index] == false){
                visit[index] = true;
                num[i] = index;
                dfs(i+1);
                visit[index] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
        System.out.println(ans);
    }
}
