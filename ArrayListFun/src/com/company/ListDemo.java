package com.company;

import java.util.ArrayList;

public class ListDemo
{
    public static void main(String[] args)
    {
        ListDemo listDemo = new ListDemo();

        listDemo.execute();
    }

    private void execute()
    {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Table");
        myList.add("Chair");
        myList.add("Sofa");

        printList(myList);

        myList.add(myList.size(), "Recliner");

        printList(myList);

        myList.add(0, "Loveseat");

        printList(myList);

        myList.add(2, "Ottoman");

        printList(myList);

        myList.remove(myList.size() - 1);

        printList(myList);

        myList.remove(0);

        printList(myList);

        myList.remove(1);

        printList(myList);


    }

    private void printList(ArrayList<String> list)
    {
        String element;

        for (int i = 0; i < list.size(); i++)
        {
            element = list.get(i);
            if (i != (list.size() - 1))
            {
                System.out.print("" + element + " : ");
            }
            else if (i == (list.size() - 1))
            {
                System.out.println("" + element);
            }
        }

    }
}
