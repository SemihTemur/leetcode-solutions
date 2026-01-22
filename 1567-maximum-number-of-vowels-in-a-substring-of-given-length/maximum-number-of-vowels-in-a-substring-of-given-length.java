class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int i = 0;
        int currentCount = 0;
        int left = 0;
        int maxLength = 0;

        for (i = 0; i < s.length(); i++) {
            if (i < k) {
                if (vowels.indexOf(s.charAt(i)) != -1)
                    currentCount++;
            } else {
                if (vowels.indexOf(s.charAt(left)) != -1)
                    currentCount--;
                if(vowels.indexOf(s.charAt(i)) != -1) 
                    currentCount++; 
                left++;
            }
            maxLength = Math.max(maxLength,currentCount);
        }

        return maxLength;
    }
}