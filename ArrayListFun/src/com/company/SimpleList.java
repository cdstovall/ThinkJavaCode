package com.company;

import java.util.ArrayList;

public class SimpleList
{
    public static void main(String[] args)
    {
        SimpleList simpleList = new SimpleList();

        simpleList.demo();
    }

    private void demo()
    {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Red");
        myList.add("Blue");
        myList.add("Green");
        myList.add("Purple");
        myList.add("Orange");

        for (int i = 0; i < myList.size(); i++)
        {
            System.out.println(myList.get(i));
        }

        for (String name : myList)
        {
            System.out.println(name);
        }


    }


}
