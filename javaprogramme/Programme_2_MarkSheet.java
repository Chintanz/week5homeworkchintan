package javaprogramme;
/**Rewrite the student mark sheet programme (From java-homework-week3
 programmes) using if else and while loop.*/

import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        student();
    }
    public static void student() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name :");
        String student_name = sc.next();

        System.out.println("Enter Student roll No :");
        int student_rollno = sc.nextInt();
        System.out.println("Math         :");
        int math = sc.nextInt();
        if (math <= 100 && math >= 0) {
            System.out.println(math);
        } else {
            System.out.println("error message “InvalidInput, Marks\n" +
                    "should between 0 to 100”");

            //   System.out.println("Math         :");
            // sc.nextInt();
        }

        System.out.println("Science :");
        int science = sc.nextInt();
        if (science <= 100 && science >= 0) {
            System.out.println(science);
        } else {
            System.out.println("error message “InvalidInput, Marks\n" +
                    "should between 0 to 100”");
            System.out.println("science         :");
            sc.nextInt();
        }

        System.out.println("English :");
        int english = sc.nextInt();
        if (english <= 100 && english >= 0) {
            System.out.println(english);
        } else {
            System.out.println("error message “InvalidInput, Marks\n" +
                    "should between 0 to 100”");
            System.out.println("English         :");
            sc.nextInt(english);

        }
        int total = math + science + english;
        double percentage = total / 3;
        String results;
        if (percentage >= 35) {
            results = "pass";
        } else {
            results = "Fail";
        }
        sc.close();


        System.out.println("_________________________________________________");
        System.out.println("|                                                 |");
        System.out.println("|                     MarkSheet                   |");
        System.out.println("|                                                 |");
        System.out.println("|    Name         :" + student_name + "                            |");
        System.out.println("|    Roll No      :" + student_rollno + "                          |");
        System.out.println("|_________________________________________________|");
        System.out.println("|    Subject      :" + "   Marks                       |");
        System.out.println("|__________________________________________________|");
        System.out.println("|    Math         :" + math + "                            |");
        System.out.println("|    science      :" + science + "                        |");
        System.out.println("|    English      :" + english + "                        |");
        System.out.println("|_________________________________________________|");
        System.out.println("|    Total        :" + total + "                           |");
        System.out.println("|________________________________________________|");
        System.out.println("|    Percentage   :" + percentage + "                |");
        System.out.println("|    Result       :" + results + "                   |");
        if (percentage >= 80) {
            System.out.println("|Garde       :        Grade A+                    |");
        } else if (percentage >= 60) {
            System.out.println("|Garde       :        Grade A                    |");
        } else if (percentage >= 50) {
            System.out.println("|Garde       :        Grade B                    |");
        } else if (percentage >= 35) {
            System.out.println("|Garde       :        Grade C                    |");
        } else {
            System.out.println("|                      Fail                    ");
        }
    }
}

