class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(high,pile);
        }

        while(low < high){
            int mid = (high+low)/2;
            if(canEat(piles,h,mid)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    private boolean canEat(int[] piles, int h, int speed) {

        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
            if (totalHours > h) {
                return false;
            }
        }
        return totalHours <= h;
    }
}