package epam.bsu.ex10.a17;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

 /**. Задан файл с текстом на английском языке. Выделить все различные слова.
 Для каждого слова подсчитать частоту его встречаемости. Слова, отличаю-
 щиеся регистром букв, считать различными. Использовать класс HashMap*/
public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("D:\\InteligeActivity\\EPAM10\\src\\epam\\bsu\\ex10\\a17\\data");

        Set<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] s = line.split("\\.|!|\\?");
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }

                for (int i = 0; i < s.length; i++) {
                    String[] words = s[i].trim().split(" |, ");
                    for (int j = 0; j < words.length; j++) {
                        System.out.print(words[j]+" ");
                        set.add(words[j]);
                        if (map.containsKey(words[j])) {
                            map.put(words[j], map.get(words[j]) + 1);
                            continue;
                        }
                        map.put(words[j], 1);
                    };
                    }
                }

            System.out.println();
            System.out.println("----unic words----");
            for (String s:set){
            System.out.print(s + " ");
            }
                System.out.println();
                for (Map.Entry entry: map.entrySet()){
                    System.out.println("Key: " + entry.getKey() + " Value: "
                            + entry.getValue());
                }
        }
        }

//     public List<String> listFromFile(File file) {
//
//         List<String> list = new ArrayList<>();
//         try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 list.add(line);
//             }
//
//         } catch (FileNotFoundException e1) {
//             e1.printStackTrace();
//         } catch (IOException e1) {
//             e1.printStackTrace();
//         }
//
//
//         return list;
//
//     }
//
//     /**
//      * возвращяет все различные слова с учетом частоты встречаемости.
//      * @param list список строк с ьекстом
//      * @return
//      */
//     public Map<String, Integer> toMap(List<String> list) {
//         Map<String, Integer> map = new HashMap<>();
//
//         list.forEach(line -> {
//             String words[] = line.split(" ");
//
//             for (String word : words) {
//                 if (map.containsKey(word)) {
//                     map.put(word, map.get(word) + 1);
//                     continue;
//                 }
//                 map.put(word, 1);
//             }
//
//         });
//
//         return map;
//     }
// }