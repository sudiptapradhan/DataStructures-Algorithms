package Septocode.day2;

import java.util.Scanner;

public class SudiptaPradhan_day2 {
    public static int year(int y1, int y2) {
        int days1 = 0;
        int days2 = 0;
        int totalDays = 0;

                if(y1%400==0){
                    days1=366;
                }
                else if(y1%100==0){
                    days1=365;
                }
                else if(y1%4==0){
                    days1=366;
                }
                else{
                    days1=365;
                }

                if(y2%400==0){
                    days2=366;
                }
                else if(y2%100==0){
                    days2=365;
                }
                else if(y2%4==0){
                    days2=366;
                }
                else{
                    days2=365;
                }

        totalDays = days1 + days2;
        return totalDays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            a[i] = year(y1, y2);
        }

        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
