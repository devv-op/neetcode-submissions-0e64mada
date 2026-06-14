class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] lsr = new int[n];
        lsr[n - 1] = n;
        st.push(n-1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                lsr[i] = n;
            } else {
                lsr[i] = st.peek();
            }
            st.push(i);
        }
        Stack<Integer> st1 = new Stack<>();
        int[] lsl = new int[n];
        lsl[0] = -1;
        st1.push(0);

        for (int i = 1; i < n; i++) {
            while (st1.size() > 0 && heights[st1.peek()] >= heights[i]) {
                st1.pop();
            }
            if (st1.size() == 0) {
                lsl[i] = -1;
            } else {
                lsl[i] = st1.peek();
            }
            st1.push(i);
        }
        int maxarea = 0;
        for (int i = 0; i < n; i++) {
            int w = lsr[i] - lsl[i] - 1;
            int area = w * heights[i];
            if (area > maxarea) {
                maxarea = area;
            }
        }
        return maxarea;
    }
}