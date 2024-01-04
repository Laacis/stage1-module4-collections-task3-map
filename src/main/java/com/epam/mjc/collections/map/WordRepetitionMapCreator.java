package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> results = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.");

        while(tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            word = word.toLowerCase();
            Integer val = results.get(word);

            if( val == null){
                results.put(word, 1);
            }else {
                results.put(word, ++val);
            }
        }

        return results;
    }
}
