package epam.bsu.ex10.a8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**Определить множество на основе множества целых чисел. Создать методы
 для определения пересечения и объединения множеств.*/
public class Main {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(31, 65, 463, 14, 523));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(14, 523, 623, 732, 823));

        Iterator i = set1.iterator();

        while(i.hasNext()) {
            int common = (Integer)i.next();
            if(set2.contains(common)) {
                System.out.println(common);
            }
        }

        Set<Integer> result = new HashSet<Integer>();
        result.addAll(set1);
        result.addAll(set2);

        System.out.println(result);
    }
}

// НаGooglил
//    Set<Integer> unite = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
//    Set<Integer> common = set1.stream().filter(set2::contains).collect(Collectors.toSet());
//        System.out.println(unite + " - " + common);