package com.y.ctc.v5.ch1;

/**
 * Created by akasha on 12/27/15.
 */
public class Q4StringAddOn {

    public static String add20(String str){
        char[] arr =str.toCharArray();
        int numSpaces = 0;
        for(char c: arr){
            if(c == ' ')
                numSpaces++;
        }

        if(numSpaces == 0)
            return str;

        //copying the old array in a new one
        char[] newArr = new char[str.length() + (numSpaces * 2)];
        for(int i = 0;i<arr.length;i++){
            newArr[i] = arr[i];

        }

        //replacing spaces with "%20" in the new array
        int j = newArr.length - 1;
        for(int i = arr.length - 1;i >= 0; i--){
            if(arr[i] != ' ') {
                newArr[j--] = arr[i];
            }
            else{
                newArr[j--] = '0';
                newArr[j--] = '2';
                newArr[j--] = '%';

            }
        }
        return new String(newArr);
    }
}
