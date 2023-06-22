class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // List<Integer> a =new ArrayList<>();

        // int p=nums1.length;
        // int q=nums2.length;
        // int l=0;
        // int r=0;

        // while (l<p && r<q && nums1[l]!=0){
        //     if(nums1[l]<=nums2[r]){
        //     a.add(nums1[l]);
        //     l++;
        //     }
        //     else{
        //         a.add(nums2[r]);
        //         r++;
        //     }
        // }
        // while(l<p){
        //     a.add(nums1[l]);
        // }
        // while(r<q){
        //     a.add(nums2[r]);
        // }
        // for(int i=0;i<a.size();i++){
        //     nums1[i]=a.get(i);
        // }
    }
}