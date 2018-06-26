package myqajava;

import java.util.ArrayList;
import java.util.Scanner;

public class MyQAJava {

    //PARAMETERS
    public void printHelloWorld() {
        System.out.println("Hello World!");
    }

    //RETURN TYPES
    public String returnHelloWorld() {

        return "HelleWorld!";
    }

    //PARAMETERS/OPERATORS
    public int twoIntegers(int a, int b, boolean ss) {

        if (a == 0 && b != 0) {
            return b;
        }

        if (b == 0 && a != 0) {
            return a;
        }

        if (ss) {

            return a + b;

        } else {

            return a * b;
        }

    }

    public int blackJack(int a, int b) {

        if (a == 21 && b == 21) { // if a = 21 b = 21, it should return 0
            return 0;
        }

        if (a <= 21 && b > 21) { //a lower or equals to 21 and b > 21, it should return a
            return a;
        }
        if (b <= 21 && a > 21) {
            return b;
        }

        if (a <= 21 && b <= 21) {

            int aa = 21 - a;
            int bb = 21 - b;

            if (aa > bb) {
                return b;
            } else {
                return a;
            }
        } else {
            return 0;
        }

    }

    public int uniqueSum(int a, int b, int c) {

        if (a == b) {

            if (b == c) {
                return 0;
            } else {
                return c;
            }

        }
        if (a == c) {
            if (c == b) {
                return 0;
            } else {
                return b;
            }
        }

        if (b == c) {

            if (c == a) {
                return 0;
            } else {
                return a;
            }

        }

        return a + b + c;
    }

    public static void main(String[] args) {

        MyQAJava myQAJava = new MyQAJava();

        System.out.println(myQAJava.uniqueSum(1, 1, 2));

        /*  System.out.println("Hello World!");
        
        
        myQAJava.printHelloWorld();
        System.out.println(myQAJava.returnHelloWorld());
        System.out.println(myQAJava.twoIntegers(6, 7, true));
        System.out.println(myQAJava.twoIntegers(4, 3, false)); */
 /*  int count = myQAJava.twoIntegers(333, 0, false);

        for (int i = 0; i < count; i++) {
            System.out.println(count);
        }

        int numbers[] = new int[10];
        numbers[0] = 66;
        numbers[1] = 88;
        numbers[2] = 33;
        numbers[3] = 76;
        numbers[4] = 23;
        numbers[5] = 65;
        numbers[6] = 90;
        numbers[7] = 12;
        numbers[8] = 45;
        numbers[9] = 77;

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i] * 10);

        } */
        // System.out.println(myQAJava.blackJack(21, 24));
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Daniel Ogunsanya", 89, "Cleaner"));
        personList.add(new Person("Zakariya Mohamed", 23, "Software Developer"));
        personList.add(new Person("Pablo Escobar", 19, "Spanish Teacher"));
        personList.add(new Person("Cristiano Ronaldo", 46, "Footballer"));
        personList.add(new Person("Lebron", 43, "Basketball Player"));
        
        
       /* for (int i = 0; i < personList.size(); i++) {
            
            System.out.println("-----------------------------------------");
            
            System.out.println("Name: "+personList.get(i).getName());
            System.out.println("Age: "+personList.get(i).getAge());
            System.out.println("Job Title: "+personList.get(i).getJobTitle());
            
            
        }  */
      
    /*  Scanner input = new Scanner(System.in);
        
        System.out.println("Search name:");
         String nameInput = input.next();
         
         for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().toLowerCase().contains(nameInput.toLowerCase()) ) {
             
            System.out.println("-----------------------------------------");
            
            System.out.println("Name: "+personList.get(i).getName());
            System.out.println("Age: "+personList.get(i).getAge());
            System.out.println("Job Title: "+personList.get(i).getJobTitle());
            
            }
        } */
        


    }

}
