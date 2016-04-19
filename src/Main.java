import com.y.com.y.common.utils.TreeNode;
import com.y.epi.ch10.SixRootToLeafPathWithSum;

import java.util.*;

/**
 *
 Given a set of strings, find the length of the longest common prefix of all the strings.
 abcde
 abcgg
 abcddfff

 -> 3
 */

class Main {
    public static void main(String[] args) {
//        List<String> strings = new ArrayList();
//        strings.add("ab");
//        strings.add("abcgg");
//        strings.add("abcddfff");
//
//        System.out.println("Length of longest " + returnLengthOfCommonPrefix(strings));

//        String[] arr = {"a", "b", "e","f", "c", "d", "a", "b", "d", "c"};
//        Set<String> set = new HashSet<String>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        System.out.println(EightSmallestSubArray.returnSmallestSubArray(arr, set));

//        String[] arr1 =  {"f", "s", "f", "e", "t", "w", "e", "n", "w", "e"};
//        System.out.println(TenLongestSubArray.findLongestSubArrayWithDistinctElements(arr1));

//        int[] num1 = {1,2,3,4};
//        int[] num2 = {6,7,8};
//        System.out.println(ThreeMultiplyTwoNumbers.multiplyTwoNumbers(num1, num2));

//        int[] delete  = {5,3,7,11,2,3,13,5,7};
//        System.out.println(Arrays.toString(FiveDeleteKeys.deleteKeysFromArray(delete, 3)));
//
        //System.out.println("COmpute " + ThreeSpreadSheetEncoding.returnEncoding("ZZ"));

      //  System.out.println("Reverse words " + SixReverseWordsInASentence.reverseWordsInAString("Alice likes Bob".toCharArray()));
//
//        int[] arr = {90, 30, 100, 40, 20};
//        System.out.println("Compute salary " + ElevenComputeSalaryThreshold.computeSalaryThreshold(arr, 210));
       // FiveComputeMedianOfOnlineData.returnMedianOfOnlineData();

        TreeNode<Integer> root = new TreeNode(5);
        root.leftChild = new TreeNode(3);
        root.rightChild = new TreeNode(8);
        root.leftChild.leftChild = new TreeNode(1);
        root.leftChild.rightChild = new TreeNode(4);
        root.rightChild.leftChild = new TreeNode(6);
        root.rightChild.rightChild = new TreeNode(9);
        System.out.println("Exists  " + SixRootToLeafPathWithSum.existsRootToLeafPath(root, 19));
    }

    public static int returnLengthOfCommonPrefix(List<String> list){
        int counter = 0;
        while(true){
            boolean isSame = true;
            for(int i =0; i< list.size()-1; i++){
                if(counter >= list.get(i).length()){
                    break;
                }

                System.out.println(list.get(i));
                System.out.println(list.get(i+1));
                System.out.println(list.get(i+1).charAt(counter));


                if(counter < list.get(i).length() && counter < list.get(i+1).length() && list.get(i).charAt(counter) != list.get(i+1).charAt(counter)){
                    isSame = false;
                    break;
                }

            }
            if(!isSame )
                break;
            counter++;
        }
        return counter;
    }

    public static Map<String, Integer> returnList(String str){
        Map<String, Integer> map = new HashMap();
        List<String> list = new ArrayList();
        String string = "";
        for(int i = 0; i< str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                string = string + str.charAt(i);
            }else{
                list.add(string);
                string = "";
            }
        }
        for(String stri: list){
            if(map.containsKey(stri)){
                map.put(stri, map.get(stri) +1);
            }else{
                map.put(stri, 1);
            }
        }

        return sortByValue(map);
    }

    public static  Map<String, Integer>
    sortByValue( Map<String, Integer> map )
    {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>( map.entrySet() );
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list)
        {
            result.put( entry.getKey(), entry.getValue() );
        }
        return result;
    }


}
