// Link: https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayList = new ArrayList();
        for(int i=0; i<numRows; i++)
        {
            List<Integer> listAtI = new ArrayList();
            listAtI.add(1);
            for(int j=0; j<i-1; j++)
            {
                listAtI.add(arrayList.get(i-1).get(j)+arrayList.get(i-1).get(j+1));
            }
            if(i!=0) listAtI.add(1);
            arrayList.add(listAtI);
        }
        return arrayList;
    }
}
