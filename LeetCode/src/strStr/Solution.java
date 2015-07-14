package strStr;

//brute force
public class Solution {
	public int strstr(String hayStack, String needle) {
		if (hayStack == null || needle == null
				|| needle.length() > hayStack.length()) {
			return -1;
		} else {
			for (int i = 0;; i++) {
				for (int j = 0;; j++) {
					if (j == needle.length())
						return i;
					if (i + j == hayStack.length())
						return -1;
					if (needle.charAt(j) != hayStack.charAt(i + j))
						break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Solution ss = new Solution();
		
		System.out.println(ss.strstr("mississippi", "issi"));
	}
}
