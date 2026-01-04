package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class WordCountMap {

    public static void main(String[] args) {
        String sentence = "java is a powerful java is";

        Map<String,Integer> wordCount = new HashMap<>();

        //split in word
        String[] words = sentence.split(" ");

        //
        for (String word : words){
            if (wordCount.containsKey(word)){
                wordCount.put(word,wordCount.get(word)+1);
            }else wordCount.put(word,1);
        }

        System.out.println("----Word Frequency----");
        for (Map.Entry<String ,Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
