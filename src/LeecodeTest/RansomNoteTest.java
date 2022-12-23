package LeecodeTest;

import java.util.HashMap;

public class RansomNoteTest {

    public static void main(String[] args) {
        String ransomNote = "cabe";
        String magazine = "aabdcef";
        RansomNoteTest r = new RansomNoteTest();

        System.out.println(r.canConstruct(ransomNote,magazine));

    }

    public boolean canConstruct(String ransomNote, String magazine) {
    /*    for(int i = 0;i<ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);
            int magazineIndex = magazine.indexOf(ch);
            System.out.println(magazineIndex);
            if(magazineIndex == -1)
                return false;
            magazine = magazine.substring(0,magazineIndex)+ magazine.substring(magazineIndex+1);
            System.out.println(magazine);

        }
        return true;*/

        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for(int i = 0; i<magazine.length(); i++) {
            char m = magazine.charAt(i);
            int count = magazineLetters.getOrDefault(m,0);
            magazineLetters.put(m,count+1);
        }

        System.out.println(magazineLetters);

        for(int j = 0; j<ransomNote.length(); j++) {

            char n = ransomNote.charAt(j);
            int currentCount = magazineLetters.getOrDefault(n,0);
            if(currentCount==0)
                return false;
            magazineLetters.put(n,currentCount-1);
        }
        return true;

    }


}
