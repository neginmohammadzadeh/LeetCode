import java.util.Scanner;

class productExceptSelf {
    public static int[] findProductExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1 ;
        
        for(int i=1 ; i<nums.length ; i++)
        {
            res[i] = res[i-1] * nums[i-1];
  
        }
        
        int temp = nums[nums.length - 1];
        for(int i = nums.length-2 ; i>=0 ;  i-- )
        {
            res[i] = res[i] * temp;
            temp =   temp * nums[i];
        }
        return res;
        
    }
    
    public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
    	
    	int arr[]= {1,2,3,4};
    	int res[]= findProductExceptSelf(arr);
    	
    	System.out.println(findProductExceptSelf(arr).toString());
//		
	}
    
}
