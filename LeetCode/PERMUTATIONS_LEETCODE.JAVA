class Solution {
    private void backtrack(List<List<Integer>> result,ArrayList<Integer>perm,int[] nums){
        if(perm.size()==nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int num:nums){
            if(perm.contains(num))
                continue;
            perm.add(num);
            backtrack(result,perm,nums);
            perm.remove(perm.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
}
