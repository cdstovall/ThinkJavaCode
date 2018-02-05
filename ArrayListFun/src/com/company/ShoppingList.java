package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList
{
    private int total = 0;

    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();

        shoppingList.run();
    }

    private void run()
    {
        ArrayList<String> myList = new ArrayList<>();

        String add = "Add";
        String remove = "Remove";
        String print = "Print";
        String clear = "Clear";
        String exit = "Exit";

        String command;

        do{
            if (myList.size() == 0)
            {
                System.out.println("There aren't any items in this list. Please add items beginning at position 0.");
            }


            do{
                System.out.println("Enter one of the following commands: Add, Remove, Print, Clear, or Exit.");

                command = scanner.nextLine();

                if (!command.equalsIgnoreCase(add) && !command.equalsIgnoreCase(remove) &&
                        !command.equalsIgnoreCase(print) && !command.equalsIgnoreCase(clear) && !command.equalsIgnoreCase(exit))
                {
                    System.out.println("Oops! Please enter a valid command.");
                }
            } while (!command.equalsIgnoreCase(add) && !command.equalsIgnoreCase(remove) &&
                    !command.equalsIgnoreCase(print) && !command.equalsIgnoreCase(clear) && !command.equalsIgnoreCase(exit));


            if (command.equalsIgnoreCase(add))
            {
                add(myList);
            }
            else if (command.equalsIgnoreCase(remove))
            {
                remove(myList);
            }
            else if (command.equalsIgnoreCase(print))
            {
                print(myList);
            }
            else if (command.equalsIgnoreCase(clear))
            {
                clear(myList);
            }

        } while (!command.equalsIgnoreCase("Exit"));

        System.out.println("You have finished editing your list.");
        print(myList);
    }

    private void add(ArrayList<String> list)
    {
        System.out.print("Enter the position where you would like to add to the list: ");

        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What would you like to add to the list at position " + number + "?");

        String addToList = scanner.nextLine();

        list.add(number,addToList);

        print(list);
    }

    private void remove(ArrayList<String> list)
    {
        System.out.print("Enter the position of the item you would like to remove from the list: ");

        int number = scanner.nextInt();
        scanner.nextLine();

        list.remove(number);

        print(list);
    }

    private void print(ArrayList<String> list)
    {
        String element;

        for (int i = 0; i < list.size(); i++)
        {
            element = list.get(i);

            if (i == 0 && list.size() == 1)
            {
                System.out.println("Item in position number " + i + ": " + element + ".");
            }
            else if (i == 0)
            {
                System.out.print("Item in position number " + i + ": " + element + ", ");
            }
            else if (i != (list.size() - 1))
            {
                System.out.print("item in position number " + i + ": " + element + ", ");
            }
            else if (i == (list.size() - 1))
            {
                System.out.println("item in position number " + i + ": " + element);
            }
        }

    }

    private void clear(ArrayList<String> list)
    {
           list.clear();
    }


}
