package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �����ӣ�dfs
 */
public class _08 {
    public static int row;  //��
    public static int line;  //��
    public static int count;  //�ܺ�
    public static int[][] grid;  //����
    public static boolean[][] visit;  //Ĭ����false

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
    //Ҫ��ô���ѣ����һ��Ƕ�ά����...Ӧ�û�Ҫ��һ������
    public static void dfs(int temp, int residue){  //λ���ݼ���ʣ��ֵ
        if(xx == -1) return;
        if(temp==0){//�������
            if(residue*2==count){
                //��������  ��ô�����  ������ֱ��ȡ�����ֵ�ɣ��Ͼ�temp�Ѿ������ˣ���Ҫ������ֵ��
                System.out.println(xx);
                xx = -1;
            }
            return;
        }
        boolean  bl = false;
        //��ά������ô��������  ���ж����������ǰһ��iû��ѡ��ǰһ��jҲû��ѡ����ô���ټ�����
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
                if(bl){  //��������
                    visit[i][j] = true;
                    dfs(temp-1,residue-grid[i][j]);
                    visit[i][j] = false;
                }
            }
        }
    }
}

/*
˼·��ȡ1λ��N-1λ��ȷ��λ��֮��ʼ����������һ���ܺͣ�ÿȡһλ���ȥ�ͣ����ж��Ƿ����������һ�롣

 */