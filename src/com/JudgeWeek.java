package com;

import java.util.Date;

/**
 * 判断今天是第几周（单/双周）。
 * https://c.runoob.com/compile/10
 */
public class JudgeWeek {

    public static void main(String[] args) {
        Date begin = new Date(Date.parse("3/4/2019"));//开始时间
        Date end = new Date();
        int days = getDiffDays(begin, end)/7+1;
        if(days%2==0){
            System.out.println("这周是第"+days+"周（双周）");
        }else {
            System.out.println("这周是第"+days+"周（单周）");
        }
    }

    /**
     * 两个日期相减得到的天数
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
