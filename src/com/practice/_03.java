package com.practice;

/**
 * 巧排扑克牌
 * Created by CHX on 2019/3/21.
 */
public class _03 {
    public static void main(String[] args) {
        //思路：用可变数组进行逆向操作
        char[] ch = {'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
        StringBuffer sb = new StringBuffer();
        sb.append('K');
        //两个动作，一个是翻牌，反过来就是插入；另一个是调换牌的位置
        for(int i=11;i>-1;i--){
            //插入
            sb.insert(0,ch[i]);
            //交换将最后一个放到第一
            sb.insert(0,sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());
    }
}
