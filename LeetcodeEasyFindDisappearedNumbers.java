public class LeetcodeEasyFindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++) {
            map.put(i+1,0);
        }
        for (int i=0;i<nums.length;i++) {
            Integer count = map.get(nums[i]);
            
            count++;
            map.put(nums[i],count);
        }
        Set<Integer> keys = map.keySet();
        for(Integer key: keys) {
            Integer val = map.get(key);
            if (val == 0) {
                ret.add(key);
            }
        }
        return ret;
    }
}