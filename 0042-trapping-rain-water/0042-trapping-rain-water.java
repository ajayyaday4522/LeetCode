public class Solution {
    public static int trap(int heigth[]) {
        int n = heigth.length;

        int leftMax[] = new int[n];
        leftMax[0] = heigth[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(heigth[i], leftMax[i - 1]);
        }

        int rigthMax[] = new int[n];
        rigthMax[n - 1] = heigth[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rigthMax[i] = Math.max(heigth[i], rigthMax[i + 1]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rigthMax[i]);
            trappedWater += waterLevel - heigth[i];
        }

        return trappedWater;

    }

    public static void main(String[] args) {
        int heigth[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trap(heigth));
    }
}
