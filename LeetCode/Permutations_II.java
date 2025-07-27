class Solution {
    private void backtrack(List<List<Integer>> result,ArrayList<Integer>perm,int[] nums,boolean[] used){
        if(perm.size()==nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int ind=0;ind<nums.length;ind++){
            if(ind>0 && nums[ind]==nums[ind-1] && !used[ind-1])
                continue;
            if(!used[ind]){
            perm.add(nums[ind]);
            used[ind]=true;
            backtrack(result,perm,nums,used);
            perm.remove(perm.size()-1);
            used[ind]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        backtrack(result,new ArrayList<>(),nums,used);
        
        return result;
    }
}
