class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int result = 0;
        int tempResult = 0;
        int n = cardPoints.length;
        for (int i = 0; i < 2 * k; i++) {
            int index = (n - k + i) % n;
            tempResult += cardPoints[index];

            if (i >= k) {
                int lastIndex = (n - k + index) % n;
                tempResult -= cardPoints[lastIndex];
            }

            result = Math.max(result, tempResult);
        }

        return result;
    }
}