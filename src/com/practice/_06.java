package com.practice;
    //�����������飬ʹ��dfs���ȫ����

import java.util.Arrays;

public class _06 {
        private static int [] result;//���ȫ���еĽ��
        private static boolean [] visit;//����һ���������
        private static int total; //ȫ���еĳ���

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
            total = 5;//�Գ���Ϊ5����
            result = new int[total];
            visit = new boolean[total];
            Arrays.fill(visit,true);
            dfs(0);
        }
    }
