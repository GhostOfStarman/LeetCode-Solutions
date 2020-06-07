//LC 804

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse = ".-\",\"-...\",\"-.-.\",\"-..\",\".\",\"..-.\",\"--.\",\"....\",\"..\",\".---\",\"-.-\",\".-..\",\"--\",\"-.\",\"---\",\".--.\",\"--.-\",\".-.\",\"...\",\"-\",\"..-\",\"...-\",\".--\",\"-..-\",\"-.--\",\"--..\"";
		    String[] morseSplit = morse.split("[\",]+");
        
        Set<String> morseSet = new HashSet<>();
        
        for(String word: words){
			String morseCode = "";
            for(int i = 0; i < word.length(); i++){
                int letterToNum = word.charAt(i) - 'a';
                morseCode += morseSplit[letterToNum];
            }
            morseSet.add(morseCode);
        }
        
        return morseSet.size();
    }
}
