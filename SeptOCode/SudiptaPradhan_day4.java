package Septocode.day4;

import java.util.Scanner;

public class SudiptaPradhan_day4 {

    public static void main(String[] args) {
        int res;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int x;
            if(arr[i] < 34 || arr[i]%5==0 || arr[i]%5<3){
                res=arr[i];
            }
            else{
                x =arr[i]/5;
                res=5*(x+1);
            }
            System.out.println(res);
        }

    }
}
