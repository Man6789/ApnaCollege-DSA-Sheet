package dsa.searching;

public class Pr_Finding_Lower_Bound_of_Array {

	public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,2,3,4,5,5,6}; 
        int a =2;
        int ans = -1;
        int lo=0, hi = arr.length-1;
        while (lo < hi){
            int mid = (lo+hi)/2;
            if (arr[mid] == 2){
                hi = mid-1;
                ans = mid;
            }else if(arr[mid] < a){
                lo++;
            }else {
                hi--;
            }
        }
        
        System.out.println(ans);
    }//main method end

}//Main method end
