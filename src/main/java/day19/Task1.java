package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> wordsMap = new HashMap<>();
        File text = new File("src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter("[.,…”:«;»„()?!\"\\s–]+");
        while (scanner.hasNext()) {
            String word = scanner.next();
            word = word.toLowerCase(Locale.ROOT);
            int a = 1;
            if (wordsMap.containsKey(word)) {
                a = wordsMap.get(word);
                a++;
                wordsMap.put(word, a);
            } else wordsMap.put(word, a);
        }
        scanner.close();
        List<Map.Entry<String, Integer>> wordsList = new ArrayList<>(wordsMap.entrySet());
        wordsList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (int i = wordsList.size() - 1; i > wordsList.size() - 100; i--) {
            System.out.println(wordsList.get(i));
        } //Чичиков 604 раза
    }
}
