package RomanInteger;

import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        String check = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>(); 
        map.put("I",1);map.put("V",5); map.put("X",10);map.put("L",50);map.put("C",100);map.put("D",500);map.put("M",1000); 
        
        int ret_int = 0; boolean prefix = false; 
        for(int i = s.length()-1; i >= 0; i--){
            if((i+1< s.length()))
                if (( map.get(""+s.charAt(i)) < map.get(""+s.charAt(i+1))))
                    prefix = true; 
            while(prefix){
                ret_int-=map.get(""+s.charAt(i));
                if(i-1>=0 && s.charAt(i-1)==(s.charAt(i)))
                    continue; 
                else 
                	break;
            }
            if(prefix)
            	prefix = false;
            else
            	ret_int+=map.get(""+s.charAt(i));
        }
        return ret_int;
    }
    public static void main(String[] args) {
    	System.out.println(romanToInt("IV"));
    }
}
