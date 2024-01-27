class Solution {
    public List<String> commonChars(String[] words) {
        List<HashMap<Character,Integer>> list = new ArrayList<>();
        //create list of hashmap so that we can store the frequency of characters for each string
        for(String s: words){
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch: s.toCharArray()){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            list.add(map);
        }
        // Ex: TC1 would look something like this [{a=1, b=1, e=1, l=2}, {a=1, b=1, e=1, l=2}, {r=2, e=1, l=2, o=1}]

        List<String> ans = new ArrayList<>();
        for(char ch : list.get(0).keySet()) {
//take the key of the first map in string(doesnt really matter 1st or 2nd just to avoid out of bound error take 0th index map's keySet)
            int min = Integer.MAX_VALUE;//find out the minimum occurrence of a character which is common in every string
            for (HashMap<Character, Integer> map : list) {//just iterate over all the maps and get the min occurrence
                if (!map.containsKey(ch)) {
//if map doesnt contain a key then we are sure that this particiular character is not common
                    min = 0;
                    break;
                }
                min = Math.min(min, map.get(ch));
            }
            for (int i = 0; i < min; i++) {
//put the common chararcter in the ans list (loop will take care of duplicates as in TC1 chaar 'l' is present twice in every string so min value for 'l' would be 2 and hence we added it twice)
                ans.add(String.valueOf(ch));
            }
        }
        return ans;
    }
}
