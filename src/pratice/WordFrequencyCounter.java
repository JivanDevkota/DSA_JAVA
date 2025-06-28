package pratice;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String str="Java is great and java is powerful";
        String[] words = str.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word:words){
                word=word.toLowerCase();

            if (wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            }else {
                wordCount.put(word,1);
            }
        }

        System.out.println("Word Frequencies: ");
        for (Map.Entry<String,Integer>entry:wordCount.entrySet()){
            System.out.println(entry.getKey()+ " => "+entry.getValue());
        }
    }
}
