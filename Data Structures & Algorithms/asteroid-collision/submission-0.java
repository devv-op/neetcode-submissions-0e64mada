class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }else{
                while(st.size() > 0 && st.peek() > 0 && st.peek() < -asteroids[i]){
                    st.pop();
                }
                if(st.size() > 0 && st.peek() == -asteroids[i]){
                    st.pop();
                }else if(st.size() > 0 && st.peek() > 0){

                }else{
                    st.push(asteroids[i]);
                }
            }
        }
        int[] result = new int[st.size()];
        int k = result.length - 1;
        while(!st.isEmpty()){
            result[k--] = st.pop();
        }
        
        return result;
    }
}