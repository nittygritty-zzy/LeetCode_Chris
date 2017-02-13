package subSets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
This is an amazing solution.Learnt a lot.Let me try to explain this to those who didn't get the logic.

Number of subsets for {1 , 2 , 3 } = 2^3 .
Why ? 
Case    	Possible outcomes for the set of subsets
  1   ->          Take or don't take = 2 
  2   ->          Take or don't take = 2  
  3   ->          Take or don't take = 2 

Therefore , total = 2*2*2 = 2^3 = { { } , {1} , {2} , {3} , {1,2} , {1,3} , {2,3} , {1,2,3} }

Lets assign bits to each outcome  -> First bit to 1 , Second bit to 2 and third bit to 3
Take = 1
Don't take = 0

0) 0 0 0  -> 	Don't take 3 , Don't take 2 , 	Don't take 1 = { } 
1) 0 0 1  -> 	Don't take 3 , Don't take 2 ,   take 1       = { 1 } 
2) 0 1 0  -> 	Don't take 3 , take 2       , 	Don't take 1 = { 2 } 
3) 0 1 1  -> 	Don't take 3 , take 2       ,   take 1    	 = { 1 , 2 } 
4) 1 0 0  ->    take 3       , Don't take 2 , 	Don't take 1 = { 3 } 
5) 1 0 1  ->    take 3       , Don't take 2 ,   take 1       = { 1 , 3 } 
6) 1 1 0  ->    take 3       , take 2       , 	Don't take 1 = { 2 , 3 } 
7) 1 1 1  ->    take 3       , take 2       ,   take 1       = { 1 , 2 , 3 } 

In the above logic ,Insert S[i] only if (j>>i)&1 == true   { j E { 0,1,2,3,4,5,6,7 }   i = ith element in the input array }

Element 1 is inserted only into those places where 1st bit of j is 1 
   if( j >> 0 & 1 )  ==> for above above e.g. this is true for sl.no.( j ) = 1 , 3 , 5 , 7 

Element 2 is inserted only into those places where 2nd bit of j is 1 
   if( j >> 1 & 1 )  ==> for above above e.g. this is true for sl.no.( j ) = 2 , 3 , 6 , 7

Element 3 is inserted only into those places where 3rd bit of j is 1 
   if( j >> 2 & 1 )  ==> for above above e.g. this is true for sl.no.( j ) = 4 , 5 , 6 , 7 

Time complexity : O(n*2^n) , for every input element loop traverses the whole solution set length i.e. 2^n
*/

public class Solution {
	public static List<List<Integer>> subsets(int[] S){
		Arrays.sort(S);
		int totalNumber = 1 << S.length;
		
		List<List<Integer>> collection = new ArrayList<List<Integer>>(totalNumber);
		for(int i = 0; i < totalNumber; i++){
			List<Integer> set = new LinkedList<Integer>();
			for(int j = 0; j < S.length; j++){
				if((i & (1<<j)) != 0){
					set.add(S[j]);
				}
			}
			collection.add(set);
		}
		return collection;
	}
	
	
	public static void main(String[] args){
		int[] S = {1,2,3,4};
		System.out.println(subsets(S));
	}
}
