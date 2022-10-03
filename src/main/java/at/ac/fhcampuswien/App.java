package at.ac.fhcampuswien;

import java.util.Scanner;

public class    App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        char a = 'Z';
        int b = 0xface, c = 012;
        long d = 80L;
        float e = 44e-1f, f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int w = (int) e;
        int x = (int) f;
        int y = (int) g;
        int z = (int) h;
        System.out.println(a + b + c + d + w + x + y + z);
    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        // Variable Werte initializieren
        int num1;
        int num2;
        int summe;
        // Werte einlesen
        Scanner scaner = new Scanner(System.in);
        num1 = scaner.nextInt();
        num2 = scaner.nextInt();
        // Berechnung Formel
        summe = num1 + num2;
        // Ausgabe Summe
        System.out.println(summe);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        // Variable deklarieren
        int num1;
        int num2;
        // Werte einlesen und ausgeben
        Scanner scaner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        num1 = scaner.nextInt();
        System.out.print("y: ");
        num2 = scaner.nextInt();
        System.out.println("After Swap:");
        System.out.print("x: ");
        System.out.println(num2);
        System.out.print("y: ");
        System.out.println(num1);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        int n1;
        int n2;
        Scanner scaner = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = scaner.nextInt();
        System.out.print("n2: ");
        n2 = scaner.nextInt();
        // 3. Bedingung
        if (n2 > n1) {
            System.out.println("n2 > n1");
        }
        if (n1 > n2) {
            System.out.println("n1 > n2");
        }
        if (n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int Umsatz = scan.nextInt();
        if (Umsatz < 0 || Umsatz >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (Umsatz < 20000 && Umsatz >= 0) {
            System.out.println("Poor Sales Revenue");
        } else if (Umsatz < 50000 && Umsatz >= 20000) {
            System.out.println("Average Sales Revenue");
        } else if (Umsatz < 80000 && Umsatz >= 50000) {
            System.out.println("Good Sales Revenue");
        } else if (Umsatz < 100000 && Umsatz >= 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println();
        }
    }

        //todo Task 8
        public void getCommissionRate () {
            // input your solution here
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter CommissionClass: ");

            int CommissionClass = scan.nextInt();
            switch (CommissionClass) {
                case 1:
                    System.out.println("Your Commission Rate was set to 0.01");
                    break;
                case 2:
                    System.out.println("Your Commission Rate was set to 0.02");
                    break;
                case 3:
                    System.out.println("Your Commission Rate was set to 0.03");
                    break;
                case 4:
                    System.out.println("Your Commission Rate was set to 0.04");
                    break;
                default:
                    System.out.println("Your Commission Rate was set to 0.0");
                    break;
            }
        }

        //todo Task 9
        public void leapyear () {
            // input your solution here
            Scanner scan = new Scanner(System.in);
            System.out.print("Year: ");
            int year = scan.nextInt();
            if (year % 4 != 0) {
                System.out.println("Not a Leapyear");
            } else if (year % 100 != 0) {
                System.out.println("Leapyear");
            } else if (year % 400 == 0) {
                System.out.println("Leapyear");
            } else {
                System.out.println("Not a Leapyear");
            }
        }

        //todo Task 10
        public void transposedNumbers () {
            // input your solution here
        }


        public static void main (String[]args){
            App exercise1 = new App();

            System.out.println("Task 1: Say Hello World");
            exercise1.sayHelloWorld();

            System.out.println("\nTask 2: Hello Robot");
            exercise1.helloRobot();

            System.out.println("\nTask 3: Literals");
            exercise1.sumOfLiterals();

            System.out.println("\nTask 4: Add two Numbers");
            exercise1.addTwoNumbers();

            System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
            exercise1.swapTwoNumbers();

            System.out.println("\nTask 6: Compare two Numbers");
            exercise1.compareTwoNumbers();

            System.out.println("\nTask 7: Rating Sales Person");
            exercise1.ratingSalesPerson();

            System.out.println("\nTask 8: Commission Rate");
            exercise1.getCommissionRate();

            System.out.println("\nTask 9: Leapyear");
            exercise1.leapyear();

            System.out.println("\nTask 10: Transposed Numbers");
            exercise1.transposedNumbers();
        }
    }
