class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Integer.MAX_VALUE;
        long max= 0;
        
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        return new pair(min,max);
    }
}