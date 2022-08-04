public class reverse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0; i<t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }

            for(int k=n-1;k>=0;k--) {
                System.out.print(arr[k] + " ");
            }
        }
    }
}