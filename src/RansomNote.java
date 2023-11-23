import java.util.*;


public class RansomNote {

    public boolean canConstruct(String randomNote, String magazine) {
        Map<Character, Integer> magMap = new HashMap<>();

        for (Character c : magazine.toCharArray()) {
            magMap.put(c, magMap.getOrDefault(c, 0) + 1);
        }

        for (char c : randomNote.toCharArray()) {
            if (!magMap.containsKey(c) || magMap.get(c) == 0) {
                return false;
            }

            magMap.put(c, magMap.getOrDefault(c, 0) - 1);
        }


        return true;
    }
}
