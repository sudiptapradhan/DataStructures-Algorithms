//not answered in the gfg arraylist format

import java.util.Scanner;

public class reverseArrayInGroups {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i=i+k){
          int l=i;
          int r=Math.min(i+k-1, n-1);
          int temp;

          while(l<r){
              temp=arr[l];
              arr[l]=arr[r];
              arr[r]=temp;
              l++;
              r--;
          }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
