class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        String[] word = sentence.split(" ");
        Set<String> dictSet = new HashSet<>(dictionary);
        
        for(int i = 0 ; i< word.length ; i++){
            word[i] = shortestRoot(word[i] , dictSet);
        }
        return String.join(" ", word) ;
      
    }
    
    private String shortestRoot(String word , Set<String> dictSet){
        
        for(int i = 1 ; i<= word.length() ; i++){
            String root = word.substring(0 , i) ;
            if(dictSet.contains(root)){
                return root ;
            }
        }
        
        return word ;
    }
}