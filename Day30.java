class Solution {
    public int smallestRepunitDivByK(int k) {
        int num=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=k;i++){
            num=(num*10+1)%k;
            if(!map.containsKey(num)) map.put(num,i);
            System.out.print(num+" ");

        }
        if(map.containsKey(0)) return map.get(0);
        return -1;
    }
}
