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

    public String name(boolean male) {

        if (male) {
            return "zak";
        } else {
            return "arwa";
        }

    }

    public static void main(String[] args) {

        MyQAJava myQAJava = new MyQAJava();

        System.out.println(myQAJava.name(true));
        System.out.println(myQAJava.name(false));

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
        personList.add(new Person("Lebron James", 43, "Basketball Player"));
        personList.add(new Person("Arwa Tawawala", 109, "Mrs right"));

        /* for (int i = 0; i < personList.size(); i++) {
            
            System.out.println("-----------------------------------------");
            
            System.out.println("Name: "+personList.get(i).getName());
            System.out.println("Age: "+personList.get(i).getAge());
            System.out.println("Job Title: "+personList.get(i).getJobTitle());
            
            
        }  */
        Scanner input = new Scanner(System.in);

        /*  System.out.println("Search name:");
         String nameInput = input.next();
         
         for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().toLowerCase().contains(nameInput.toLowerCase()) ) {
             
            System.out.println("-----------------------------------------");
            
            System.out.println("Name: "+personList.get(i).getName());
            System.out.println("Age: "+personList.get(i).getAge());
            System.out.println("Job Title: "+personList.get(i).getJobTitle());
            
            }
        }  */
        Garage garage = new Garage();

        garage.addNewVehicle(new Car(4, 2000.0, "Fred Parker"));
        garage.addNewVehicle(new Motorcycle(2, 9000.0, "Bob Jerry"));
        garage.addNewVehicle(new Van(4, 5000.0, "Karina Johnson"));
        garage.addNewVehicle(new Car(4, 27000.0, "Marc Brown"));
        garage.addNewVehicle(new Car(4, 223000.0, "Danny Rose"));
        garage.addNewVehicle(new Lorry(8, 255000.0, "Paul Pogba"));
        garage.addNewVehicle(new Lorry(10, 222000.0, "Bill Gates"));
        garage.addNewVehicle(new Motorcycle(2, 200.0, "Nathan Ahrens"));

        for (int i = 0; i < garage.getAllVehicles().size(); i++) {
            System.out.println("------------------------------------------------");
            System.out.println("A " + garage.getAllVehicles().get(i).getVehicleType()
                    + " with " + garage.getAllVehicles().get(i).getNumberOfWheels() + " wheels owned by "
                    + garage.getAllVehicles().get(i).getOwner() + ".");

        }

        System.out.println("Search vehicle by name:");
        String vehicleOwner = input.next();

        System.out.println("Found vehicles:");
        
        for (int i = 0; i < garage.searchVehicleByOwner(vehicleOwner).size(); i++) {

            System.out.println("A " + garage.searchVehicleByOwner(vehicleOwner).get(i).getVehicleType()
                    + " with " + garage.searchVehicleByOwner(vehicleOwner).get(i).getNumberOfWheels() + " wheels owned by "
                    + garage.searchVehicleByOwner(vehicleOwner).get(i).getOwner() + ".");
        }

    }

}
