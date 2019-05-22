package com.practice;

/**
 *卖鸡蛋
 * Created by CHX on 2019/3/27.
 */
public class _09 {
    public static void main(String[] args) {
        //x+y=150  x*n=y*m  x*m=3200  y*n=2450
        //个数为整数，价格乘100也为整数，未知数为4个
/*        for(int a=1;a<150;a++)
        for(int b=1;b<150;b++)
        for(int c=1;c<3200;c++)
            for (int d=1;d<3200;d++){
                if(a+b==150 && a*c==b*d && a*d==3200 && b*c==2450){
                    System.out.println("a:"+a+" ;/nb:"+b+" ;/nc:"+c+" ;/nd:"+d);
                    return;
                }
            }*/

        //优化：可以根据公式消除n和m，得到x+y=150
        //m=3200/x  n=2450/y  x*2450/y=y*3200/x
        //即为x*x*2450=y*y*3200
        for(int i=1;i<150;i++){
            for(int j=1;j<150;j++){
                if(i+j==150 && i*i*2450==j*j*3200){
                    System.out.println("i="+i+"; j="+j);
                }
            }
        }
    }
}
