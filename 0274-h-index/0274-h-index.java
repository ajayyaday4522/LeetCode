class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int i = 0, j = citations.length - 1;

        while(i < j){
            int temp = citations[i];
            citations[i] = citations[j];
            citations[j] = temp;
            i++;
            j--;
        }

        int h = 0;
        while (h < citations.length && citations[h] >= (h + 1)) {
            h++;
        }
        return h;

    }
}