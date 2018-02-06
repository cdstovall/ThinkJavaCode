package com.company;

import java.util.HashMap;

public class TimeZoneDemo
{
    HashMap<String,Integer> hashMap = new HashMap<>();

    public static void main(String[] args)
    {
        TimeZoneDemo timeZoneDemo = new TimeZoneDemo();

        timeZoneDemo.demo();
    }

    private void demo()
    {
        hashMap.put("EST",-5);
        hashMap.put("CST",-6);
        hashMap.put("MST",-7);
        hashMap.put("PST",-8);
        hashMap.put("GMT",0);

        System.out.println(getTimeDiff("PST","EST"));
        System.out.println(getTimeDiff("EST","PST"));

    }

    private double getTimeDiff(String timeZone1, String timeZone2)
    {
        double timeDiff = 0;

        double tz1 = hashMap.get(timeZone1);
        double tz2 = hashMap.get(timeZone2);

        //Check to make sure the result would be the same regardless of the order the keys are entered in
        if (tz1 < tz2)
        {
            timeDiff = tz1 - tz2;
        }
        else if (tz2 < tz1)
        {
            timeDiff = tz2 - tz1;
        }
        else
        {
            System.out.println("Oops.");
        }

        return timeDiff;
    }
}
