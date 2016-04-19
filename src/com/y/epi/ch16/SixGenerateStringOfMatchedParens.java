package com.y.epi.ch16;

import java.util.*;

/**
 * Created by akasha on 3/7/16.
 */
public class SixGenerateStringOfMatchedParens {

    public static List<String> generateStringOfParams(int n){
        return new ArrayList<String>(generateSetStringOfParams(n));
    }

    public static Set<String> generateSetStringOfParams(int n){
        if(n == 1){
            Set<String> set = new HashSet<String>();
            set.add("()");
            return set;
        }else{
            Set<String> set = generateSetStringOfParams(n-1);
            Set<String> tmpset = new HashSet();
            Iterator<String> it = set.iterator();
            while(it.hasNext()){
                String next = it.next();
                tmpset.add(next + "()");
                tmpset.add("()" + next);
                tmpset.add("(" + next+ ")");
            }
            set.addAll(tmpset);
            return set;
        }
    }

    public static List<String> generateStringOfParams2(int n){
        List<String> result = new ArrayList();
        recurseGenerateStringOfMatchedParens2(n, n, result, "");
        return result;
    }

    public static void recurseGenerateStringOfMatchedParens2(int leftParens, int rightParens, List<String> result, String str){
        if (leftParens == 0 && rightParens == 0) {
            result.add(str);
            return;
        }
        if(leftParens > 0  ){
            recurseGenerateStringOfMatchedParens2(leftParens - 1, rightParens, result, str + "(");
        }
        if(rightParens > leftParens){
            recurseGenerateStringOfMatchedParens2(leftParens, rightParens - 1, result, str + ")");
        }
    }
}
