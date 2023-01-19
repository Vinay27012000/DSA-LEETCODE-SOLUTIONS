class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] counting = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) nums[i] += nums[i - 1];
            counting[(nums[i] % k + k) % k]++;
        }
        int result = counting[0];
        for (int frequency : counting)
            result += frequency * (frequency - 1) / 2;
        return result;
    }
}