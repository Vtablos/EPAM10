package epam.bsu.ex10.a1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**Ввести строки из файла, записать в список. Вывести строки в файл в обрат-
 ном порядке.*/

public class TextReader {

    private String filename = "";
    private String newFileName = "";

    public TextReader(String fileName, String newFileName) {
        this.filename = fileName;
        this.newFileName = newFileName;
    }


    private ArrayList<String> strings = new ArrayList<>();

    public void readFile() {
        try {

            FileReader reader = new FileReader(filename);
            BufferedReader in = new BufferedReader(reader);
            String string;
            while ((string = in.readLine()) != null) {
                String[] s= string.split(" ");
              for (int i=0; i<s.length;i++){
                  strings.add(s[i]);
              }
            }

            System.out.println(strings);
            Collections.reverse(strings);
            System.out.println(strings);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public  void write() {

        File file = new File(newFileName);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {

                out.print(strings);
            } finally {

                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }



    }

