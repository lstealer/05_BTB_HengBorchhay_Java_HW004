import ExceptionHandler.CountNode;
import ExceptionHandler.NullValueException;
import ExceptionHandler.SameValueExcetption;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NullValueException, SameValueExcetption {
        Scanner scanner = new Scanner(System.in);
        CountNode<Integer> sList = new CountNode();
        //if want to test NullValueException
        // sList.addNode(null);
        for (int i = 0; i < 1000; i++)
            sList.addNode(i);

//        if want to test SameValueException
//        sList.addNode(1);
        System.out.println("Input value as Integer:");

        //Displays the nodes present in the list
        sList.display();

        //Counts the nodes present in the given list
        System.out.println("Count of nodes present in the list: " + sList.countNodes());
//        below throw SameValueExcetption
//        sList.update(0, 5);
        sList.display();

//        testing other type variable
        CountNode<String> sList2 = new CountNode<>();
        sList2.addNode("dog");
        sList2.addNode("cat");
        sList2.addNode("wolf");
//        if wanna see exception
//        sList2.addNode(null);
        sList2.countNodes();
        sList2.display();
        sList2.update(1,"cow");
        sList2.display();
        CountNode<Number> sList3=new CountNode<>();
        sList3.addNode(12.3f);
        sList3.addNode(32.4d);
        sList3.addNode(123);
        sList3.display();
    }
}

