package pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> allrows = new ArrayList<List<Integer>>();
		ArrayList<Integer> row = new ArrayList<Integer>();
		for (int i = 0; i < numRows; i++) {
			row.add(0, 1);
			for (int j = 1; j < row.size() - 1; j++)
				row.set(j, row.get(j) + row.get(j + 1));
			allrows.add(new ArrayList<Integer>(row));
		}
		return allrows;
	}
	
	public static List<Integer> getRow2(int rowIndex) {
	    List<Integer> ret = new ArrayList<Integer>();
	    ret.add(1);
	    for (int i = 0; i <= rowIndex; i++) {
	    	ret.add(1);
	        for (int j = 1 ; j < ret.size(); j++) {
	            int tmp = ret.get(j) + ret.get(j + 1);
	            ret.set(j, tmp);
	        }
	    }
	    return ret;
	}
}
