class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        getCombSum(candidates, target, 0, res, new ArrayList<>()); 
        return res;
    }

    private void getCombSum(int[] candidates, int target, int i, List<List<Integer>> res, List<Integer> list) {
        
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (i >= candidates.length)
            return;

        // pick
        if (candidates[i] <= target) {
            list.add(candidates[i]);
            getCombSum(candidates, target - candidates[i], i, res, list);
            list.remove(list.size() - 1);
        }

        // not-pick
        getCombSum(candidates, target, i + 1, res, list);

    }    
}