import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int sayi : nums) {
            if (set.contains(sayi)) {
                return true;
            }
            set.add(sayi);
        }
        return false;
    }
}