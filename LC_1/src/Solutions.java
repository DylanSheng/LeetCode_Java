import java.util.HashMap;

/**
 * Created by sheng on 2016/10/8.
 */
public class Solutions {
    public static void main(String[] args) throws Exception{
        int[] nums = {2,7,11,13};
        int target = 9;
        Solutions s = new Solutions();
        int[] ans = s.twoSum(nums, target);
        for(int i : ans){
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; ++i){
            if(m.containsKey(target - nums[i])){
                ans[1] = i;
                ans[0] = m.get(target - nums[i]);
                return ans;
            }
            m.put(nums[i], i);
        }
        return ans;
    }
}
