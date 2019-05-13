package com.practice;

import java.util.Arrays;

/**
 * dfs  ���䡢��⡢ʹ��
 * �ȼ�ס��Ȼ���ʹ�ã�����ͬʱ������⡣
 */
public class _07 {
    public static int[] number;
    public static int[] result;
    public static boolean[] visit;  //trueΪ�ɷ���
    public static int total;

    /**
     * dfs
     * @param count  �ݹ鵽�ڼ���
     */
    public static void dfs(int count){  //ȷ���ڼ�λ
        //����
        if(count==total){
            System.out.println(Arrays.toString(result));
            return;
        }

        //������ѭ��+�ݹ���ã���visit���жϻع�
        for(int i=0;i<total;i++){  //ȷ����λȡ�ڼ���ֵ
            if(visit[i]){
                visit[i] = false;
                //��������ֳ��˵ڼ�λȡ�ڼ���ֵ������result��countΪ�±꣬numberȡ��i��
                result[count] = number[i];
                dfs(count+1);  //��һλ
                visit[i] = true;  //�ع�
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