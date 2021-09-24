package Septocode.day3;

import java.util.Scanner;

public class SudiptaPradhan_day3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String inp[] = str.split(",");
        for (String out : inp)
            System.out.println(out);
    }
}
