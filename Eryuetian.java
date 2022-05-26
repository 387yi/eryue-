package text_5_26;

import java.util.Calendar;
import java.util.Scanner;

public class Eryuetian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入要查询的年份");
        int year=sc.nextInt();

        Calendar c=Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int date=c.get(Calendar.DATE);
        System.out.println(year+"年二月有"+date+"天");
    }
}
