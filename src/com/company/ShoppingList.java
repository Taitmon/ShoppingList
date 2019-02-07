package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class ShoppingList
{

    ArrayList<String> mylist = new ArrayList<>();
    boolean moreItems = true;
    Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        ShoppingList list = new ShoppingList();
        list.run();
    }


    private void run()
    {
        System.out.println("=================================================================================");
        System.out.println("Please enter any command listed.");
        System.out.println("\"Add\" to add a item to the list.");
        System.out.println("\"Print\" to print the list.");
        System.out.println("\"Remove\" to remove a item from the list.");
        System.out.println("\"Clear\" to clear or delete all items on the list.");
        System.out.println("\"Exit\" to end the program.");
        System.out.println("=================================================================================");
        System.out.println("If the command pertains to an item " +
                "then enter the command along with the item.");

        do
        {
            System.out.println("=================================================================================");
            System.out.println("Enter a command.");
            String itemCommands = input.next();

            switch (itemCommands)
            {
                case "a":
                case "Add":
                case "add":
                    addItems();
                    break;
                case "p":
                case "Print":
                case "print":
                    printItems();
                    break;
                case "r":
                case "Remove":
                case "remove":
                    removeItem();
                    break;
                case "c":
                case "Clear":
                case "clear":
                    mylist.clear();
                    break;
                case "Help":
                case "help":
                    printHelp();
                break;
                case "e":
                case "Exit":
                case "exit":
                    printExit();
                    break;
                default:
                printDefault();
                break;

            }
        } while (moreItems);
    }

    public void addItems()
    {
        String item = input.next();
        mylist.add(item);
    }

    public void printItems()
    {
        for ( int index = 0; index < mylist.size(); index++  )
        {
            System.out.println(index + ":" + mylist.get(index));
        }
    }

    public void removeItem()
    {
        String item = input.next();
        mylist.remove(item);
    }

    public void printHelp()
    {
        System.out.println("\"Add\" to add a item to the list.");
        System.out.println("\"Print\" to print the list.");
        System.out.println("\"Remove\" to remove a item from the list.");
        System.out.println("\"Clear\" to clear or delete all items on the list.");
        System.out.println("\"Exit\" to end the program.");
    }

    public void printExit()
    {
        System.out.println("Thank you for using the revolutionary program \"Shoppeing List\" " +
                "and thank you for the double rations.");
        moreItems = false;
    }

    public void printDefault()
    {
        System.out.println("Please try entering another command or " +
                "enter help for the list of commands.");
    }

}
