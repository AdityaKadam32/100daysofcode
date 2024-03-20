class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // create a set of all different jewels 
        Set<Character> jewelSet = new HashSet<>();
        for(int i=0; i < jewels.length(); i++)
            jewelSet.add(jewels.charAt(i));
      //  update score
      int score = 0;
      for(int i = 0; i < stones.length(); i++)
       if(jewelSet.contains(stones.charAt(i)))
            score++;

       return score;   
    } 
}
