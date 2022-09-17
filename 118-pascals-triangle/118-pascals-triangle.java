class Solution {
    public List<List<Integer>> generate(int numRows) {
        // creating a list of list to store result
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //creating a list for current row and previous row and giving it null
		List<Integer> row, pre = null;
        
        
		for (int i = 0; i < numRows; ++i) 
        {//initialising row every time to store new values
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)//no. of rows and col. are equal
				if (j == 0 || j == i) // if it is first or last column assign zero 1 it
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j)); //else assign previous element
			pre = row;      //make this as previous for further operation
			res.add(row);  //add to result
		}
		return res;
    }
}