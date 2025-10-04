class LargestHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] lsb= new int[n];
        for(int i=0;i<n;i++){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            lsb[i]=st.size()>0?st.peek():-1;
            st.push(i);
        }
        st=new Stack<>();
        int[] rsb = new int[n];
        for(int i=n-1; i>=0;i--){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            rsb[i]=st.size()>0?st.peek():n;
            st.push(i);
        }
        int maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int width=rsb[i]-lsb[i]-1;
            int length=heights[i];
            int area=length*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}
