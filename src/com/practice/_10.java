package com.practice;

/**
 * ֽ��������
 * Created by CHX on 2019/3/27.
 */
public class _10 {

    public static int sum;

    public static void dfs(int[] arr,int start){
        if(start == 8){
            //ѡ��
            check(arr);
            return;
        }
        //����
        int temp = 0;
        for(int i=start;i<9;i++){
            //������i��start
            temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
            dfs(arr,start+1);
            temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
        }
    }

    private static void check(int[] arr) {
        if(arr[0]+arr[1]+arr[3]+arr[5] == arr[0]+arr[2]+arr[4]+arr[8]
        && arr[0]+arr[1]+arr[3]+arr[5] == arr[5]+arr[6]+arr[7]+arr[8]){
            sum++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        dfs(arr,0);
        System.out.println(sum/6);
    }

}
