package com.practice;

import java.util.Scanner;

/**
 * ȡ����Ϸ
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
        //���������һ������ʧ�󣬴�Ψһ��a��b������ȡ��
        //�龰ģ�⣬a���ã�������ô���ǣ����ֻ��һ����������
        //boolean�ж���a����b
        if(num==1){
            return false;
        }
        //ѡ�����1���������֮��ֻʣһ������ô������
        //ѡ�����2����������ǣ��Ǹ��ö��٣��õݹ���ܹ�Ӯ���Ǹ�
        //������Ҫ����ֵ���÷���ֵ���ơ�˫����ѡ���Ž⣬��ʵ�Ȿ���Ͼ���һ���򵥵ĵݹ����
        //ǰ��Ľ���������棬�ݹ顣

        //�ݹ飬��ô�ݹ鴫�ݵ�ֵ��ʲô���Լ���ô���á�Ҫ�������룬�����ٵ�ʱ��
        //����ѡ���Ӯ�ģ����趼��ѡ�����ŵ���һ��������һ����Ӯ�ˣ������Ƿ���ǰһ�����෴
        for(int i=0;i<4;i++){
            if(num>temp[i] && !chickBall(num-temp[i])) return true ;
        }
        return false;
    }
}
