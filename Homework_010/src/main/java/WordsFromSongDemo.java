import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 1) With the help of HashMap try to calculate all of the unique words in the song Umbrella ignoring the case.
 * Print all of these words to the console with the number of times they appear in the text.
 * Find the most frequent word in the text and print it to the console as well.
 */

public class WordsFromSongDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("Homework_010/src/main/java/song"));
        HashMap<String, Integer> wordsRepeat = new HashMap();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] wordsFromLine = line.toLowerCase().split("\\W+");
            for (String word : wordsFromLine) {
                if (wordsRepeat.containsKey(word)) {
                    wordsRepeat.put(word, wordsRepeat.get(word) + 1);
                } else {
                    wordsRepeat.put(word, 1);
                    //    wordsRepeat.merge(wordsFromLines, 1, Integer::sum);
                }
            }
        }
        for (Map.Entry<String, Integer> pair : wordsRepeat.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        /*
        int max = Collections.max(wordsRepeat.values());
        System.out.println((wordsRepeat.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));
        System.out.println(max);
        */

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : wordsRepeat.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey + " " + maxValue);
    }
}