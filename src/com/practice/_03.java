package com.practice;

/**
 * �����˿���
 * Created by CHX on 2019/3/21.
 */
public class _03 {
    public static void main(String[] args) {
        //˼·���ÿɱ���������������
        char[] ch = {'A','2','3','4','5','6','7','8','9','0','J','Q','K'};
        StringBuffer sb = new StringBuffer();
        sb.append('K');
        //����������һ���Ƿ��ƣ����������ǲ��룻��һ���ǵ����Ƶ�λ��
        for(int i=11;i>-1;i--){
            //����
            sb.insert(0,ch[i]);
            //���������һ���ŵ���һ
            sb.insert(0,sb.charAt(sb.length()-1));
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.toString());
    }
}
