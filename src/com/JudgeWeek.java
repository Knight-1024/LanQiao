package com;

import java.util.Date;

/**
 * �жϽ����ǵڼ��ܣ���/˫�ܣ���
 * https://c.runoob.com/compile/10
 */
public class JudgeWeek {

    public static void main(String[] args) {
        Date begin = new Date(Date.parse("3/4/2019"));//��ʼʱ��
        Date end = new Date();
        int days = getDiffDays(begin, end)/7+1;
        if(days%2==0){
            System.out.println("�����ǵ�"+days+"�ܣ�˫�ܣ�");
        }else {
            System.out.println("�����ǵ�"+days+"�ܣ����ܣ�");
        }
    }

    /**
     * ������������õ�������
     */
    public static int getDiffDays(Date beginDate, Date endDate) {
        if (beginDate == null || endDate == null) {
            throw new IllegalArgumentException("getDiffDays param is null!");
        }
        long diff = (endDate.getTime() - beginDate.getTime())
                / (1000 * 60 * 60 * 24);
        int days = new Long(diff).intValue();
        return days;
    }
}
