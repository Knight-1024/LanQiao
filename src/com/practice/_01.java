package com.practice;
import java.util.Scanner;

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
     * @param nweight 总重
     * @param nvalue 总值
     * @param W 背包重量
     * @param i 第i件商品
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
     * @param nweight 总重
     * @param nvalue 总值
     * @param W 背包重量
     * @param i 第i件商品
     */
    private static void completePack(int nweight, int nvalue, int W,int i){
        for(int j = nweight; j <= W; j++){  //注意这里，01和完全背包在这里只有遍历的方向不同
            dp[j] = Math.max(dp[j-nweight]+nvalue,dp[j]);
            System.out.print("dp["+i+","+j+"]="+dp[j]+"\t");
        }
        System.out.println();
    }
}

/**
 * 输入
 * 
 * 第1行，2个整数，N和W中间用空格隔开。N为物品的种类，W为背包的容量。(1 <= N <= 100，1 <= W <= 50000) 第2 -
 * N + 1行，每行3个整数，Wi，Pi和Ci分别是物品体积、价值和数量。(1 <= Wi, Pi <= 10000， 1 <= Ci <=
 * 200)
 * 
 * 输出
 * 
 * 输出可以容纳的最大价值。
 * 
 * 输入示例
 * 
 * 3 6 2 2 5 3 3 8 1 4 1
 * 
 * 输出示例
 * 
 * 9
 */