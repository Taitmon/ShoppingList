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
                case "Add":
                case "add":
                    addItems();
                    break;
                case "Print":
                case "print":
                    for ( int index = 0; index < mylist.size(); index++  )
                    {
                        System.out.println(index + ":" + mylist.get(index));
                    }
                    break;
                case "Remove":
                case "remove":
                    String item = input.next();
                    mylist.remove(item);
                    break;
                case "Clear":
                case "clear":
                    mylist.clear();
                    break;
                case "Help":
                case "help":
                System.out.println("\"Add\" to add a item to the list.");
                System.out.println("\"Print\" to print the list.");
                System.out.println("\"Remove\" to remove a item from the list.");
                System.out.println("\"Clear\" to clear or delete all items on the list.");
                System.out.println("\"Exit\" to end the program.");
                break;
                case "Exit":
                case "exit":
                    System.out.println("Thank you for using the revolutionary program \"Shoppeing List\" " +
                            "and thank you for the double rations.");
                    moreItems = false;
                    break;
                default:
                System.out.println("Please try entering another command or " +
                                "enter help for the list of commands.");
                break;

            }
        } while (moreItems);
    }

    public void addItems()
    {
        String item = input.next();
        mylist.add(item);
    }

}
