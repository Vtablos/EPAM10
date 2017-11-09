package epam.bsu.ex10.a1;
/**Ввести строки из файла, записать в список. Вывести строки в файл в обрат-
 ном порядке.*/
public class Main {
    public static void main(String[] args) {


        TextReader textReader = new TextReader("D:\\InteligeActivity\\EPAM10\\src\\epam\\bsu\\ex10\\a1\\data","D:\\InteligeActivity\\EPAM10\\src\\epam\\bsu\\ex10\\a1\\newData");
        textReader.readFile();
        textReader.write();


    }
}
