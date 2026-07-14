class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) {
            return false;
        }

        HashMap<Character, Integer> setA = new HashMap<>();
        HashMap<Character, Integer> setB = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            setA.put(s.charAt(i), setA.getOrDefault(s.charAt(i), 0) + 1);
            setB.put(t.charAt(i), setB.getOrDefault(t.charAt(i), 0) + 1);
        }

        return setA.equals(setB);
    }
}