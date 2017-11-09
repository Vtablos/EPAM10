package epam.bsu.ex10.a7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**Задать два стека, поменять информацию местами.*/
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Stack<Integer> st1 = new Stack<Integer>();
        Stack<Integer> st2 = new Stack<Integer>();


        st1.push(77);
        st1.push(88);


        st2.push(11);
        st2.push(222);


        System.out.println("First stack " + st1);
        System.out.println("Second stack " + st2);

        Iterator<Integer> i = st1.iterator();
        Iterator<Integer> i2 = st2.iterator();


        while(i.hasNext()) {
            list.add(i.next());
        }

        while(i2.hasNext()) {
            list2.add(i2.next());
        }

        st1.clear();

        for(int j =0;j<list2.size();j++) {
            st1.push(list2.get(j));
        }

        st2.clear();

        for(int j =0;j<list.size();j++) {
            st2.push(list.get(j));
        }


        System.out.println("First stack after " + st1);
        System.out.println("Second stack after " + st2);

    }
}
