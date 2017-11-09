package epam.bsu.ex10.a2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**Ввести число, занести его цифры в стек. Вывести число, у которого цифры
 идут в обратном порядке.
 * 1) берем число, конвертируем его в массив символов стандартной функцией;
 2) в цикле, for, начиная с первого символа, складываем символы в стек, неважно какой;
 3) в цикле, while(!stack.isEmpty()), берем символы, складываем их в массив символов, можно в старый, т.к. количество цифр одинаково.
 4) конвертируем в число полученный массив символов, опять же стандартной функцией.
 5) выводим на экран.*/
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        int n=0;
        System.out.println("enter number ");
        Scanner scanner = new Scanner(System.in);
        try {
            n = scanner.nextInt();

        } catch (InputMismatchException e)
        {
            System.out.print("enter number" );
        }

        char [] numbers = String.valueOf(n).toCharArray();
        for(char num : numbers){
            stack.push(num);}

        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }
}

