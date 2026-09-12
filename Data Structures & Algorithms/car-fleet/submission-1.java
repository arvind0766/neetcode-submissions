class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        int n = position.length;

        for (int i = 0; i < n; i++) {
            pq.add(new Integer[] {position[i], speed[i]});
        }

        int result = 0;
        double previousFleet = 0.0;
        while (!pq.isEmpty()) {
            Integer[] nearTarget = pq.poll();
           double remainingTime = (double) (target - nearTarget[0]) / nearTarget[1];
            if (previousFleet < remainingTime) {
                previousFleet = remainingTime;
                result++;
            }
        }

        return result;
    }
}
