package javaprogramme;

import java.util.ArrayList;

/** Declare following two arrylist and compare it */
public class Programme_11 {
    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Greeen");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Greeen");
        c2.add("Black");
        c2.add("White");
        c2.add("Pink");
        if(c1.equals(c2)) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}