package com.company;

import java.util.HashMap;

public class SimpleMap
{
    public static void main(String[] args)
    {
        SimpleMap simpleMap = new SimpleMap();

        simpleMap.demo();
    }

    private void demo()
    {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("USA","United States");
        hashMap.put("MEX","Mexico");
        hashMap.put("CAN", "Canada");

        System.out.println("The value stored with USA is: " + hashMap.get("USA"));
    }
}
