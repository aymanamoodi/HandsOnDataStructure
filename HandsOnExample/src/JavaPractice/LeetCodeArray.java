package JavaPractice;

public class LeetCodeArray {
	 public int[] twoSum(int[] nums, int target) {
	        int a[]=new int[2];
	        for(int i=0;i<nums.length;i++){
	        	System.out.println("iteration rate "+i+" "+nums[i]);
	            for(int j=i+1;j<nums.length;j++){
	            	System.out.println("value of index"+nums[i]+" "+nums[j]);
	                if(target==nums[i]+nums[j]){
	                    System.out.println(i);
	                    System.out.println(j);
	                   a[0]=i;
	                    a[1]=j;
	                }
	            }
	        }
	        return a;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {3,2,4};
		int target=6;
		LeetCodeArray lca = new LeetCodeArray();
		int [] a=lca.twoSum(nums, target);
		System.out.println(a[0]+" "+a[1] );
		
	}

}
