package Septocode.day1;

import java.util.Scanner;

public class SudiptaPradhan_day1 {
    public static void main(String[] args) {

        // n denotes number of players
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        playerScore(a,b,c,n);

    }
    static void playerScore(int a, int b, int c,int n){
        int s;
        s = a + ((b*c)/a) - b;
        System.out.println(s);
    }
}
