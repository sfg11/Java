import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {
    public static int NUMBER_LETTERS = 26;
    /* given two strings (lowercase a->z, how many characters do we need to remove (from either)
     * to make them anagrams (permutations of a word)?
     * example: hello, billion --> answer: 6 (he from hello and biin from billion)
     */
    public static int getDelta(int[] array1, int[] array2){
        if(array1.length != array2.length){
            return -1;
        }
        int delta =0;
        for ( int i = 0; i < array1.length; i++) {
            int difference = Math.abs(array1[i] - array2[i]);
            delta += difference;
        }
        return delta;
    }
    public static int[] getCharCounts(String s) {
        int[] charCounts = new int[NUMBER_LETTERS];
        for ( int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            int offset = (int)'a';
            int code = c - offset;
            charCounts[code]++;

        }
        return charCounts;
    }
    public static int numberNeeded(String first, String second){
        int[] charCount1 = getCharCounts(first);
        int[] charCount2 = getCharCounts(second);
        return getDelta(charCount1, charCount2);


    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String first = br.readLine();
            String second = br.readLine();
            System.out.println(numberNeeded(first,second));

        }
    }

