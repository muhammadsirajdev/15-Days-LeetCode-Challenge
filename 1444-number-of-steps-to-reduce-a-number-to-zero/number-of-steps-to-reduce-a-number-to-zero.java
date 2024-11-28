class Solution {
    public int numberOfSteps(int num) {
        return count(num,0);
    }
    public int count(int num,int count){
        if(num==0)return  count;
        if(num%2==0){
           return count(num/2,count+1);
        }
        return count(num-1,count+1);
    }
}