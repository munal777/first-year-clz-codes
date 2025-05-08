public class Main {
    static int binary_search(int[] nums, int k) {
        int l = 0;
        int r = nums.length - 1;

        int n = 0;

        while (l <= r) {
            int mid = (l + r)/2;

            if (nums[mid] == k) 
            {
                n += mid;
                break;
            }
            else if (nums[mid] > k) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,10,12,26};
        int k = 12;
        System.out.println(binary_search(nums, k));
    }
}
