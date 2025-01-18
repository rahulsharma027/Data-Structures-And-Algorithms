import java.util.HashSet;

class IntOfTwoArr{
    static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> res = new HashSet<Integer>();
        for(int it : nums1){
            set.add(it);
        }
        for(int it : nums2){
            if(set.contains(it)){
                res.add(it);
            }
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for(int it : res){
            arr[i++] = it;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 8, 9, 10};
        System.out.println("Intersection of two arrays: ");
        int[] res = intersection(arr1, arr2);
        for(int it : res){
            System.out.print(it + " ");
        }
        System.out.println();
    }
}