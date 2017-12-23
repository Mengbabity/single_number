package single_number;

public class solution {
    public int singleNumber(int[] nums) {
    	int result=0;
    	int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
             for(int j=i+1;j<nums.length;j++)
             {
            	 if(nums[i]!=nums[j])
            	 {
            		 count++;
            		 if(count==nums.length-i-1)
            		 {
            			 result=nums[i];
            			 System.out.println(result);
            			 return result;
            		 }
            	 }
            	 else
            	 {
            		 break;
            	 }
             }
        }
        System.out.println(result);
        return result;
    }
}
