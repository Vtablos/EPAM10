package epam.bsu.ex10.a4;
/**Создать список из элементов каталога и его подкаталогов.*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static ArrayList<File> arr = new ArrayList<File>();

    public static void main(String[] args) {
        File file = new File("D:\\InteligeActivity\\EPAM10\\src\\epam\\bsu\\ex10\\a4\\folder");
        try {
            arr = listFile(file);
        } catch (IOException e) {
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static ArrayList<File> listFile(File file) throws IOException {
        File[] FolderContent = file.listFiles();// D:\InteligeActivity\EPAM10\src\epam\bsu\ex10\a4\folder\file1 & file2
        for (int i = 0; i < FolderContent.length; i++) {
            if (FolderContent[i].isDirectory()) {
                arr.add(FolderContent[i]);
                listFile(FolderContent[i]);//recursion
            }
        }
        return arr;
    }
}

