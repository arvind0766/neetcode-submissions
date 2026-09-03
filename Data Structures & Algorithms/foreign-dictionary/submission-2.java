class Solution {
    public String foreignDictionary(String[] words) {
        int[] indegree = new int[26];
        Arrays.fill(indegree, -1);
        for (String word : words)
            for (char c : word.toCharArray()) indegree[c - 'a'] = 0;

        int chars = 0;
        for (int i = 0; i < 26; i++) if (indegree[i] != -1) chars++;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList());

        // Check and create Dependency graph
        for (int i = 0; i < words.length - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];
            int len = Math.min(s1.length(), s2.length());
            int j = 0;
            while (j < len && s1.charAt(j) == s2.charAt(j)) {
                j++;
            }
            if (j == len) {
                if (s1.length() > s2.length()) return "";
                continue;
            }
            int s1c = s1.charAt(j) - 'a';
            int s2c = s2.charAt(j) - 'a';
            adj.get(s1c).add(s2c);
            indegree[s2c]++;
        }

        return findOrder(adj, indegree, chars);
    }

    private String findOrder(List<List<Integer>> adj, int[] indegree, int count) {
        StringBuilder result = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (indegree[i] == 0)
                queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.append((char) (current + 'a'));
            for (Integer next : adj.get(current)) {
                indegree[next]--;
                if (indegree[next] == 0)
                    queue.offer(next);
            }
        }
        if (result.length() != count)
            return "";

        return result.toString();
    }
}