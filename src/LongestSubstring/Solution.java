package LongestSubstring;
import java.util.HashMap;
	
class Solution {
		   public static int lengthOfLongestSubstring(String s) {
		   int max_length = 1; 
		   int curr_length = 1;
		   int start_index = 0;
		   int end_index =0;
		   HashMap<Integer, Character> map = new HashMap(); 
		        
		   if (s.length() == 1 || s.length() == 0)
			   return s.length(); 
		        
		   map.put(0, s.charAt(0));
		   start_index = 0;     
		   for(int i = 1; i < s.length(); i++){
		           //if unique, add to hashmap and traverse 
		            
			   if(!map.containsValue(s.charAt(i))){
				   map.put(i, s.charAt(i)); 
		           curr_length++;
		       }
			   else{
				   map.clear();
				   i = start_index+1;
				   start_index = i;
				   map.put(i, s.charAt(i));
				   curr_length = 1;  
				   
			   }
			   if (max_length <= curr_length){
				   max_length = curr_length; 
			   }
		            
		   }
		   return max_length; 
		        
		   }
		    
		
public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.out.println("Output: " + lengthOfLongestSubstring("dvdf"));

}
}
	

