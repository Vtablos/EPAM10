package epam.bsu.ex10.a14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**. Ввести строки из файла, записать в список ArrayList. Выполнить сорти-
 ровку строк, используя метод sort() из класса Collections.*/
public class Main {
    public static void main(String[] args) {


         ArrayList<String> strings = new ArrayList<>();


        try {

            FileReader reader = new FileReader("D:\\InteligeActivity\\EPAM10\\src\\epam\\bsu\\ex10\\a14\\data");
            BufferedReader in = new BufferedReader(reader);
            String string;
            while ((string = in.readLine()) != null) {
                String[] s = string.split(" ");

                for(int i=0; i<s.length; i++){
                    strings.add(s[i]);
                }
        }

            Collections.sort(strings);
            System.out.println(strings);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

