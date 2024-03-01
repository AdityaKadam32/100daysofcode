class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0; 
        int windowVowels = 0;
        
        Set<Character> vowels = new  HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o');
        vowels.add('u');

        // count the number of vowels  in first window
        for (int i = 0; i<k; i++)
            if(vowels.contains(s.charAt(i)))
            windowVowels++;

            maxVowels = windowVowels;

        // slide the window and add the maximum number of vowels 
        for(int i = k ; i < s.length(); i++){
            if(vowels.contains(s.charAt(i-k)))
            windowVowels--;

            if(vowels.contains(s.charAt(i)))
            windowVowels++;

            maxVowels = Math.max(maxVowels, windowVowels);

        }
        return maxVowels;
        
    }
}
