package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingListSilver
{
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        ShoppingListSilver shoppingListSilver = new ShoppingListSilver();

        shoppingListSilver.run();
    }

    private void run()
    {
        ArrayList<String> myList = new ArrayList<>();

        String add = "Add";
        String remove = "Remove";
        String print = "Print";
        String clear = "Clear";
        String exit = "Exit";
        String sort = "Sort";
        String find = "Find";

        String command;

        do{
            if (myList.size() == 0)
            {
                System.out.println("There aren't any items in this list. Please add items beginning at position 0.");
            }

            do{
                System.out.println("Enter one of the following commands: Add, Remove, Print, Clear, Sort, Find, or Exit.");

                command = scanner.nextLine();

                if (!command.equalsIgnoreCase(add) && !command.equalsIgnoreCase(remove) &&
                        !command.equalsIgnoreCase(print) && !command.equalsIgnoreCase(clear) &&
                        !command.equalsIgnoreCase(exit) && !command.equalsIgnoreCase(sort) && !command.equalsIgnoreCase(find))
                {
                    System.out.println("Oops! Please enter a valid command.");
                }
            } while (!command.equalsIgnoreCase(add) && !command.equalsIgnoreCase(remove) &&
                    !command.equalsIgnoreCase(print) && !command.equalsIgnoreCase(clear) &&
                    !command.equalsIgnoreCase(exit)&& !command.equalsIgnoreCase(sort) && !command.equalsIgnoreCase(find));

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
            else if (command.equalsIgnoreCase(sort))
            {
                sort(myList);
            }
            else if(command.equalsIgnoreCase(find))
            {
                find(myList);
            }

        } while (!command.equalsIgnoreCase("Exit"));

        System.out.println("You have finished editing your list.");
        print(myList);
    }

    private void add(ArrayList<String> list)
    {
        System.out.println("What would you like to add to the list?");

        String addToList = scanner.nextLine();

        list.add(addToList);

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
                System.out.println("item in position number " + i + ": " + element + ".");
            }
        }

    }

    private void clear(ArrayList<String> list)
    {
        list.clear();

        print(list);
    }

    private void sort(ArrayList<String> list)
    {
        Collections.sort(list);

        print(list);
    }

    private void find(ArrayList<String> list)
    {
        System.out.println("Which item on the list are you looking for?");

        String searchFor = scanner.nextLine();

        if (list.contains(searchFor))
        {
            System.out.println("Found it! It is in position " + list.indexOf(searchFor));
        }
        else
        {
            System.out.println("No such item!");
        }
    }
}
