package epam.bsu.ex10.a16;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**. Задан файл с текстом на английском языке. Выделить все различные слова.
 Слова, отличающиеся только регистром букв, считать одинаковыми.
 Использовать класс HashSet*/
public class Main {


    public static void main(String[] args) throws IOException {


        File file = new File("D:\\InteligeActivity\\EPAM10\\src\\epam\\bsu\\ex10\\a16\\data");

        Set<String> set = new HashSet<>();

//            StringBuilder stringBuilder = new StringBuilder();
        String line;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        while ((line = bufferedReader.readLine()) != null) {
            String[] s = line.toLowerCase().split("\\.|!|\\?");
            for (int i=0; i<s.length; i++){
                System.out.println(s[i]);
            }


            for (int i = 0; i < s.length; i++) {
             String[]  m = s[i].trim().split(" |, ");
                for (int j=0; j<m.length; j++){
                    System.out.println(m[j]);
                    set.add(m[j]);
                }
            }

        }

        bufferedReader.close();
        System.out.println(set);
    }

}