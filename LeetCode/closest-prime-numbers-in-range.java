class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] prime=new boolean[right+1];
        Arrays.fill(prime,true);
        prime[1]=false;
        for(int i=2;i*i<=right;i++){
            if(prime[i]){
            for(int j=i*i;j<=right;j+=i){
                prime[j]=false;
            }}
        }
        for(int i=left;i<=right;i++){
            if(prime[i]){
                res.add(i);
            }
        }
        if(res.size()<2){
            return new int[]{-1,-1};
            
        }
        int min=Integer.MAX_VALUE;
        int[] res1=new int[2];
        for(int i=1;i<res.size();i++){
            int gap=res.get(i)-res.get(i-1);
            if(gap<min){
                min=gap;
                res1[0]=res.get(i-1);
                res1[1]=res.get(i);
            }
        }return res1;
    }
}
