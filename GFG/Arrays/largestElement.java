class largestElement {
    
    public int largest(int arr[], int n)
    {
        
        Arrays.sort(arr);
        int large=0;
        for(int i=1;i<n;i++){
            large=arr[n-1];
        }
        return large;
    }
}