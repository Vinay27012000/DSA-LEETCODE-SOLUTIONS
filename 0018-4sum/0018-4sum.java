class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        if (nums.length < 4) return new ArrayList<>(result);
        Arrays.sort(nums);

        for (int i=0;i<nums.length-3;i++){
            int first= nums[i];
            for(int j=i+1;j<nums.length-2;j++){
                int second = nums[j];
                    int left = j + 1;
                    int right = nums.length - 1;

                while (left < right) {

                    long sum = (long)first + (long)second + (long)nums[left] + (long)nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(first, second, nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
                
            }
        }
        return new ArrayList<>(result);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna