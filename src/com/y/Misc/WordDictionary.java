package com.y.Misc;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by akasha on 2/29/16.
 */
public class WordDictionary {

    TrieNode root;

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode curr = root;
        for(int i = 0; i < word.length();i++){
            if(curr.neighbours.containsKey(word.charAt(i))){
                curr = curr.neighbours.get(word.charAt(i));
            }
            else{
                TrieNode c = new TrieNode(word.charAt(i));
                if(i == word.length() - 1)
                    c.isLeaf = true;
                curr.neighbours.put(word.charAt(i), c);
                curr = curr.neighbours.get(word.charAt(i));
            }
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public void search(String word) {
        TrieNode curr = root;
        System.out.println("Finding word  " + word + " resulted in " + searchHelper(curr, word));

    }

    public boolean searchHelper(TrieNode curr, String word){
        if(word.length() == 0 && curr.isLeaf){
            return true;
        }
        for(int i = 0; i < word.length(); i++){
            Character c = word.charAt(i);
            if(c == '.'){
                Iterator<Character> it = curr.neighbours.keySet().iterator();
                while(it.hasNext()){
                    Character character = it.next();
                    TrieNode newNode = curr.neighbours.get(character);
                    if(searchHelper(newNode, word.substring(i+1))){
                        return true;
                    }
                }
                return false;
            }else{
                if(curr.neighbours.containsKey(c)){
                    return searchHelper(curr.neighbours.get(c), word.substring(i + 1));
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public WordDictionary(){
        this.root = new TrieNode(null);
    }
}

class TrieNode{
    Character c;
    HashMap<Character, TrieNode> neighbours;
    boolean isLeaf;

    public TrieNode(Character c){
        this.c = c;
        this.neighbours = new HashMap<Character, TrieNode>();
    }


}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");