class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    static void merge(int[] nums,int left ,int mid ,int right){
        int n=mid-left+1;
        int m=right-mid;
        int[] L=new int[n];
        int[] J=new int[m];
        for(int i=0;i<n;i++){
            L[i]=nums[left+i];
        }
        for(int j=0;j<m;j++){
            J[j]=nums[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n && j<m){
            if(L[i]<J[j]){
                nums[k]=L[i];
                i++;
                
            }
            else{
                nums[k]=J[j];
                j++;

            }
            k++;
        }
            while(i<n){
                nums[k]=L[i];
                i++;
                k++;
            }
            while(j<m){
                nums[k]=J[j];
                j++;
                k++;
            }



        }
    
    static void mergeSort(int[] nums,int left,int right){
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
}