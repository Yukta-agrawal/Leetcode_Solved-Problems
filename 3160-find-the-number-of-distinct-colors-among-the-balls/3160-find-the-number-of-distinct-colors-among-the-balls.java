import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        // HashMap to store the queries
        HashMap<Integer, Integer> map = new HashMap<>();
        // HashMap to track the frequency of each value in the map
        HashMap<Integer, Integer> valueFrequency = new HashMap<>();
        // HashSet to store unique values
        HashSet<Integer> uniqueValues = new HashSet<>();

        int n = queries.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int key = queries[i][0];
            int value = queries[i][1];

            // If the key already exists, update frequency and possibly remove old value from uniqueValues
            if (map.containsKey(key)) {
                int oldValue = map.get(key);
                valueFrequency.put(oldValue, valueFrequency.get(oldValue) - 1);
                if (valueFrequency.get(oldValue) == 0) {
                    uniqueValues.remove(oldValue);
                }
            }

            // Add the new key-value pair to the map
            map.put(key, value);

            // Update frequency of the new value
            valueFrequency.put(value, valueFrequency.getOrDefault(value, 0) + 1);
            // Add new value to uniqueValues if it's not already there
            uniqueValues.add(value);

            // Store the size of uniqueValues set in the answer array
            ans[i] = uniqueValues.size();
        }

        return ans;
    }
}
