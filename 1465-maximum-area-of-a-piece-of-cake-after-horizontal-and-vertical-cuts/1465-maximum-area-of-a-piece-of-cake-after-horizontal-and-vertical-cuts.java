class Solution {
    public int maxArea(int h, int w, int[] a, int[] b) {
        return (int)((getMax(a, h) * getMax(b, w)) % 1000000007);
    }
    
    private long getMax(int[] a, int magnitude) {
        
        Arrays.sort(a);
        
        long max = 0l;
        for(int i = 0; i < a.length; i++) 
            max = Math.max(max, a[i] - (i - 1 >= 0 ? a[i - 1] : 0));
        max = Math.max(max, magnitude - ((a.length > 0) ? a[a.length - 1] : 0));
        
        return max;
    }
}