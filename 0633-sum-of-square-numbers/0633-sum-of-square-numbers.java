class Solution {
    public boolean judgeSquareSum(int c) {
        int num = (int)Math.sqrt(c);

        double arr[] = new double[num+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        long j = arr.length - 1, i=0;

        while (i<=j) {
            if (c == (i * i) + (j * j)) {
                return true;
            } else if (c < (i * i) + (j * j)) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}