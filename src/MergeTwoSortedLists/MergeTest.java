package MergeTwoSortedLists;
public class MergeTest {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,0,0,0}; 
		int[] arr2 = {2,5,6}; 
		merge(arr1,3,arr2,3);
		for(int num:arr1) {
			System.out.println(num);
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //List<Integer> n1 = new ArrayList<Integer>(); 
        int i = m-1; int j =n-1; 
        while(i>=0 || j>=0){
        	if(j<0) {
        		nums1[i+j+1]=nums1[i];
        		i--;
        	}
        	else if(i<0) {
        		nums1[i+j+1]=nums2[j];
        		j--;
        	}
        	else {
        		nums1[i+j+1] = Integer.max(nums1[i],nums2[j]);
            	if(Integer.max(nums1[i],nums2[j])==nums1[i])
            		i--; 
            	else
            		j--; 
        	}
        }
    }
}
