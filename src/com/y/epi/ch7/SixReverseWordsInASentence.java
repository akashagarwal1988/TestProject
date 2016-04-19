package com.y.epi.ch7;

/**
 * Created by akasha on 4/2/16.
 */
public class SixReverseWordsInASentence {

    public static String reverseWordsInAString(String string){
        // Identify words (separated by white space characters) and add them to the result string in reverse order.

        String result = "";
        int lastWordIndex = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' ') {
                String word = string.substring(lastWordIndex, i);
                result = word + " " +  result;
                lastWordIndex = i + 1 ;
            }
        }
        result = string.substring(lastWordIndex, string.length()) + " " + result;
        return result;
    }

    public static String reverseWordsInAString(char[] string){
      //    Reverse the whole array , then reverse words identifying them by spaces.

        //Reversing whole array
        reverseCharactersInArray(string, 0 , string.length-1);

        //Reversing words one by one
        int low = 0;
        for(int i = 0; i < string.length; i++){
            if(string[i] == ' ') {
                reverseCharactersInArray(string, low, i - 1);
                low = i+1;
            }
        }
        reverseCharactersInArray(string, low, string.length-1);

        return new String(string);

    }

    private static void reverseCharactersInArray(char[] string, int low, int high){
        while(low<high){
            char tmp = string[low];
            string[low] = string[high];
            string[high] = tmp;
            low++;
            high--;
        }
    }
}
