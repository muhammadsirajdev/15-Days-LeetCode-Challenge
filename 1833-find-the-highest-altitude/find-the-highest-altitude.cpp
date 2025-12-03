class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        // make 2 pointers, one for current altitude, one for max attitude
        //initially current altitude = 0 initially, and max =0 or curr alt
        //hr iteration pa current ma i+1 wla ko add kr do
        //update max altitude if curr>max else not
        // return max altitude
        int curAlt=0;
        int maxAlt=curAlt;

        for (int i=0; i<gain.size() ;i++ ){
            curAlt += gain[i];
            if (curAlt>maxAlt){
                maxAlt = curAlt;
            }
        }
        return maxAlt;
    }
};