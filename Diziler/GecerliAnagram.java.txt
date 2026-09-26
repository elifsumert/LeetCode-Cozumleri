import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
        return false;
    }

    HashMap<Character, Integer > harfSayilari = new HashMap<>();

    for(char c : s.toCharArray()){
    harfSayilari.put(c, harfSayilari.getOrDefault(c, 0) + 1);
    }

    for(char c : t.toCharArray()){
        harfSayilari.put(c, harfSayilari.getOrDefault(c, 0) - 1 );
    }

    for(int sayi : harfSayilari.values() ){
        if(sayi!=0){
            return false;
        }
    }


    return true ; 



    }
}