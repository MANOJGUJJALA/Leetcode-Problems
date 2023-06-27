class Solution {
    public int[] twoSum(int[] a, int target) {

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<a.length;i++){
            if( map.containsKey(target-a[i])){
                
                int y[]=new int[2];
                y[0]=map.get(target-a[i]);
                y[1]=i;
                return y;
            }

            map.put(a[i],i);
        }
        return new int[0];
    }
}