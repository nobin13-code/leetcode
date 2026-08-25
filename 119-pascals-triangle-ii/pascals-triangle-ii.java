class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pas= new ArrayList();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> a= new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    a.add(1);
                }
                else{
                    List<Integer> prev= pas.get(i-1);
                    a.add(prev.get(j)+prev.get(j-1));
                }
            }
            pas.add(a);
        }
        return pas.get(rowIndex);
    }
}