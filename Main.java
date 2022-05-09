package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fifthItem();
        howLarge();
        lastItem();
        IndexOfInteger();
        SumOfList();
    }
    public static void fifthItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        ArrayList list1 = new ArrayList<>();
        String one = "";
        do {
            System.out.println("Please enter a string");
            one = scanner.nextLine();
            list1.add(one);
        } while (!one.equals(""));

        System.out.println(list1.size());
        while (true) {
            if (one.equals(""))
                break;
            else
                list1.add(one);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println("The fifth item on the list is " + (list1.get(4)));
    }

    public static void howLarge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello again!");
        ArrayList list1 = new ArrayList<>();
        String one = "";
        do {
            System.out.println("Please enter a string");
            one = scanner.nextLine();
            list1.add(one);
        } while (!one.equals(""));


        while (true) {
            if (one.equals(""))
                break;
            else
                list1.add(one);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println("The total number of items on this list is " + (list1.size()-1 ));
    }

    public static void lastItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Next method!");
        ArrayList list1 = new ArrayList<>();
        String one = "";
        do {
            System.out.println("Please enter a string");
            one = scanner.nextLine();
            list1.add(one);
        } while (!one.equals(""));


        while (true) {
            if (one.equals(""))
                break;
            else
                list1.add(one);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println("The last item on this list is " + (list1.get(list1.size()-2)) );
    }

    public static void IndexOfInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Next method!");
        ArrayList list1 = new ArrayList<>();
        int one;
        do {
            System.out.println("Please enter an integer");
            one = Integer.parseInt(scanner.nextLine());
            list1.add(one);
        } while (one != (0));


        while (true) {
            if (one == (0))
                break;
            else
                list1.add(one);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        System.out.println("Done getting integers.");
        System.out.println("What number are you looking for in the list?");
        int two = Integer.parseInt(scanner.nextLine());
        System.out.println((two) + " appears at index " + (list1.indexOf(two)) );
    }

    public static void SumOfList() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Final method!");
        ArrayList <Integer> list1 = new ArrayList<>();

        int one;
        while (true) {
            System.out.println("Please enter an integer");
            one = Integer.parseInt(scanner.nextLine());
            if (one == (0))
                break;
            else
                list1.add(one);
        }
        System.out.println("The items on this list are:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {

            int element = list1.get(i);
            sum += element;

        }

        System.out.println("Total sum of this list is " + (sum));

        int totes = list1.size();
        System.out.println("Total length of this list is " + (totes));


    }

}