package javaprogramme;

import java.util.ArrayList;
/**. Write a Java program to create a new array list, add some colours (string) and
 printout the collection using for each loop.*/

public class Programme_4 {
    int [] a = new int[6];

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("Yellow");
        list.add("Blue");
        list.add("White");
        list.add("Red");
        list.add("Purple");
        list.add("Orange");
        System.out.println(list.size());
        System.out.println(list);

        for ( Object colours : list ) {
            System.out.println(colours);
            
        }
    }


}
