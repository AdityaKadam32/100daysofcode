class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);

        // Start backtracking from the beginning
        backtrack(resultList, new ArrayList<>(), nums,0);
        return resultList;
        
    }
    private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int [] nums, int start){
        // If the set is already present, just continue
        if(resultSets.contains((tempSet)))
        return;

        resultSets.add(new ArrayList<>(tempSet));

        for(int i = start; i < nums.length; i++) {
            // case of including the number
            tempSet.add(nums[i]);

            // backtrack the new subset
            backtrack(resultSets, tempSet, nums, i+1);

            // Case of not- including the number
            tempSet.remove(tempSet.size()-1);
        }
    }
}
