package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 剪格子，dfs
 */
public class _08 {
    public static int row;  //行
    public static int line;  //列
    public static int count;  //总和
    public static int[][] grid;  //格子
    public static boolean[][] visit;  //默认是false

    public static int xx;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        line = sc.nextInt();
        grid = new int[row][line];
        visit = new boolean[row][line];
        visit[0][0] = true;

        for(int i=0;i<row;i++){
            for(int j=0;j<line;j++){
                grid[i][j] = sc.nextInt();
                count += grid[i][j];
            }
        }
        for(int j=1;j<row*line;j++){
            xx = j;
            dfs(j,count - grid[0][0]);
            if(xx == -1) return;
            xx = 0;
        }
        if(xx == 0){
            System.out.println(0);
        }
    }
    //要怎么深搜？而且还是二维数组...应该还要传一个参数
    public static void dfs(int temp, int residue){  //位数递减，剩余值
        if(xx == -1) return;
        if(temp==0){//遍历完成
            if(residue*2==count){
                //条件成立  怎么输出？  好像不能直接取得输出值吧，毕竟temp已经减掉了？又要新增加值？
                System.out.println(xx);
                xx = -1;
            }
            return;
        }
        boolean  bl = false;
        //二维数组怎么遍历？？  加判断条件，如果前一个i没有选且前一个j也没有选，那么则不再继续。
        for(int i=0;i<row;i++){
            for(int j=0;j<line;j++){
                if(i==0 && j==0)  continue;
                else if(i==0 && j!=0 && !visit[0][j-1]){
                    bl = true;
                }else if(i!=0 && j==0 && !visit[i-1][0]){
                    bl = true;
                }else if(i!=0 && j!=0){
                    if(visit[i][j-1] || visit[i-1][j]) bl = true;
                }
                if(bl){  //条件成立
                    visit[i][j] = true;
                    dfs(temp-1,residue-grid[i][j]);
                    visit[i][j] = false;
                }
            }
        }
    }
}

/*
思路从取1位到N-1位，确定位数之后开始搜索，设置一个总和，每取一位则减去和，并判断是否等于总数的一半。

 */