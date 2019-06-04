package task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Person 1 name?");
        String name1 = input.next();
        System.out.println("Person 2 name?");
        String name2 = input.next();
        System.out.println("What is your age " + name1 + " ?");
        int age1 = input.nextInt();
        System.out.println("What is your age " + name2 + " ?");
        int age2 = input.nextInt();
        System.out.println("One last question, what is your favorite day " + name1 + "?");
        String day1 = input.next();
        System.out.println("One last question, what is your favorite day " + name2 + "?");
        String day2 = input.next();

        input.close();

        System.out.println("First person's name is: " + name1 + " ,age is " + age1 + " years old. Favorite day is: " + day1);
        System.out.println("Second person's name is: " + name2 + " ,age is " + age2 + " years old. Favorite day is: " + day2);

        //ternary
        //System.out.println("%s", (day1.equals("Saturday")||day1.equals("Sunday")?"weekens\n":"casual days\n"));
        printDayPreference(name1, day1);
        printDayPreference(name2, day2);
    }

    public static void printDayPreference(String name, String day) {
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("You like casual days " + name);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("You like weekends " + name);
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

    }

}


