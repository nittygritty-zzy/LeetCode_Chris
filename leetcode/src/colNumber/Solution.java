package colNumber;

public class Solution {
	
    public int titleToNumber(String s) {
        int colNumber = 0;
        for (int i = 0; i < s.length()  ; i++){
            colNumber = colNumber*26 + ((int)s.charAt(i)-64);
            System.out.println(((int)s.charAt(i)));
        }
        return colNumber;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution cn = new Solution();
		System.out.println(cn.titleToNumber("AB"));
	}	

}
