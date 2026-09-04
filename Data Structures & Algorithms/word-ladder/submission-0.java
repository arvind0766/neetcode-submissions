class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        queue.add(new Pair(beginWord, 1));
        set.remove(beginWord);

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            String word = pair.word;
            int dist = pair.distance;
            if (word.equals(endWord))
                return dist;

            char[] wordChars = word.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                char current = wordChars[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (current == c)
                        continue;
                    wordChars[i] = c;
                    String newWord = new String(wordChars);
                    if (set.contains(newWord)) {
                        set.remove(newWord);
                        queue.offer(new Pair(newWord, dist + 1));
                    }
                }
                wordChars[i] = current;
            }
        }

        return 0;
    }
}

class Pair {
    public String word;
    public int distance;
    public Pair(String word, int dist) {
        this.word = word;
        this.distance = dist;
    }
}