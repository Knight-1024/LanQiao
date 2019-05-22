package com.practice;
import java.util.Scanner;

/**
 * 混合三种背包问题
 * Created by CHX on 2019/3/19.
 */
public class _01 {
    private static int[] dp;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int W = in.nextInt();

        int index = 0;
        int[] weight = new int[N];  //重量
        int[] value = new int[N];  //价值
        int[] count = new int[N];  //数量
        while (index < N){
            weight[index] = in.nextInt();
            value[index] = in.nextInt();
            count[index] = in.nextInt();
            index++;
        }

        dp = new int[W+1];

        //这里还是不太理解，照敲后再自己敲一遍，然后参考例题去解一些题吧。
        for (int i = 1; i < N+1; i++){
            if(count[i-1]*weight[i-1] >= W){
                //表示无限量供应，直到背包放不下
                completePack(weight[i-1],value[i-1],W,i);
            }else{

                //重点是这里，怎么分解和使用。
                int m = count[i-1];
                for(int k = 1; k <= m; k <<= 1){  //二进制的分解，使用K<<=1
                    zeroOnePack(k*weight[i-1],k*value[i-1],W,i);
                    m -= k;
                }
                zeroOnePack(weight[i-1]*m,value[i-1]*m,W,i);
            }
        }
        System.out.println(dp[W]);
    }

    /**
     * 01背包解法
     *
     * @param nweight
     *          总重
     * @param nvalue
     *          总值
     * @param W
     *          背包重量
     * @param i
     *          第i件商品
     */
    private static void zeroOnePack(int nweight, int nvalue, int W,int i){
        for(int j = W;j >= nweight; j--){
            dp[j] = Math.max(dp[j-nweight]+nvalue,dp[j]);
            System.out.print("dp["+i+","+j+"]="+dp[j]+"\t");
        }
        System.out.println();
    }

    /**
     * 完全背包解法
     *
     * @param nweight
     *          总重
     * @param nvalue
     *          总值
     * @param W
     *          背包重量
     * @param i
     *          第i件商品
     */
    private static void completePack(int nweight, int nvalue, int W,int i){
        for(int j = nweight; j <= W; j++){  //注意这里，01和完全背包在这里只有遍历的方向不同
            dp[j] = Math.max(dp[j-nweight]+nvalue,dp[j]);
            System.out.print("dp["+i+","+j+"]="+dp[j]+"\t");
        }
        System.out.println();
    }
}
