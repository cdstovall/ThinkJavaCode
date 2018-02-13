package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PetHotel
{
    TreeMap<Integer, String> hotelRooms;
    private Scanner scanner;

    public PetHotel()
    {
        hotelRooms = new TreeMap<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args)
    {
        PetHotel petHotel = new PetHotel();

        petHotel.run();
    }

    private void run()
    {
        String command;
        String[] words;

        String petName;
        int roomNumber;

        do
        {
            int fromRoomNumber;
            int toRoomNumber;

            if (hotelRooms.isEmpty())
            {
                System.out.println("There aren't any pets here right now.");
            }

            /* Valid commands:
            Checkin <petname> <roomNumber>;
            Checkout <petname> <roomNumber>;
            Move <petname> <fromRoomNumber> <toRoomNumber>;
            Swap <roomNumber> <roomNumber>;
            MoveOver (moves all pets to roomNumber + 1, 109 goes to 100)
            Occupancy (list occupants);
            CloseForSeason (clear map);
            Exit (ends program) */

            System.out.print("Enter command: ");
            String inputLine = scanner.nextLine();
            words = inputLine.split(" ");
            command = words[0];

            if (command.equalsIgnoreCase("CheckIn"))
            {
                petName = words[1];
                roomNumber = Integer.parseInt(words[2]);

                checkIn(petName, roomNumber);
            }
            else if (command.equalsIgnoreCase("CheckOut"))
            {
                petName = words[1];
                roomNumber = Integer.parseInt(words[2]);

                checkOut(petName, roomNumber);
            }
            else if (command.equalsIgnoreCase("Move"))
            {
                petName = words[1];
                fromRoomNumber = Integer.parseInt(words[2]);
                toRoomNumber = Integer.parseInt(words[3]);

                move(petName, fromRoomNumber, toRoomNumber);
            }
            else if (command.equalsIgnoreCase("MoveOver"))
            {
                moveOver();
            }
            else if (command.equalsIgnoreCase("Occupancy"))
            {
                getOccupancy();
            }
            else if (command.equalsIgnoreCase("CloseForSeason"))
            {
                closeForSeason();
            }
            else if (command.equalsIgnoreCase("Swap"))
            {
                int firstRoomNumber = Integer.parseInt(words[1]);
                int secondRoomNumber = Integer.parseInt(words[2]);

                swap(firstRoomNumber, secondRoomNumber);
            }
            else if (command.equalsIgnoreCase("Exit"))
            {
                System.out.println("You have ended the program!");
            }
            else
            {
                System.out.println("Sorry, I didn't understand that. Please enter a valid command.");
            }
        } while (!command.equalsIgnoreCase("Exit"));

    }

    private boolean roomNotReal(int roomNumber)
    {
        return !(roomNumber >= 100 && roomNumber <= 109);
    }

    private boolean roomTaken(int roomNumber)
    {
        return !(hotelRooms.get(roomNumber) == null);
    }

    private boolean wrongPet(String petName, int roomNumber)
    {
        return !(hotelRooms.get(roomNumber).equalsIgnoreCase(petName));
    }

    private void checkIn(String petName, int roomNumber)
    {
        if (roomNotReal(roomNumber))
        {
            System.out.println("Sorry, we only have rooms 100 - 109. Please select a room that exists.");
        }
        else if (roomTaken(roomNumber))
        {
            System.out.println("Sorry, this room already has an occupant. Please select a different one.");
        }
        else
        {
            hotelRooms.put(roomNumber, petName);
            System.out.println("" + petName + " checked into room " + roomNumber + ".");
        }
    }

    private void checkOut(String petName, int roomNumber)
    {
        if (roomNotReal(roomNumber))
        {
            System.out.println("Sorry, we only have rooms 100 - 109. Please select a room that exists.");
        }
        else if (!roomTaken(roomNumber))
        {
            System.out.println("Your pet is not in room number " + roomNumber + ".");
        }
        else
        {
            if (wrongPet(petName, roomNumber))
            {
                System.out.println("This is not the pet you're looking for.");
            }
            else if (roomTaken(roomNumber))
            {
                hotelRooms.remove(roomNumber, petName);
                System.out.println("" + petName + " has been checked out of room number " + roomNumber + ".");
            }
        }
    }

    private void move(String petName, int fromRoomNumber, int toRoomNumber)
    {
        if (roomNotReal(fromRoomNumber))
        {
            System.out.println("Sorry, we only have rooms 100 - 109. " + petName + " is currently in a room that exists. Please try again.");
        }
        else if (roomNotReal(toRoomNumber))
        {
            System.out.println("Sorry, we only have rooms 100 - 109. We cannot move " + petName + " to a room that does not exist.");
        }
        else if (!roomTaken(fromRoomNumber))
        {
            System.out.println("Your pet is not in room number " + fromRoomNumber + ".");
        }
        else
        {
            if (roomTaken(toRoomNumber))
            {
                System.out.println("Sorry, room number " + toRoomNumber + " already has an occupant. Please select a different one.");
            }
            else if (wrongPet(petName, fromRoomNumber))
            {
                System.out.println("This is not the pet you're looking for.");
            }
            else
            {
                hotelRooms.remove(fromRoomNumber);
                hotelRooms.put(toRoomNumber, petName);
                System.out.println("" + petName + " has been moved from room number " + fromRoomNumber + " to room number " + toRoomNumber + ".");
            }
        }
    }

    private void swap(int firstRoomNumber, int secondRoomNumber)
    {
        if (roomNotReal(firstRoomNumber))
        {
            System.out.println("Sorry, we only have rooms 100 - 109. The pet you are looking for is currently in a room that exists. Please try again.");
        }
        else if (roomNotReal(secondRoomNumber))
        {
            System.out.println("Sorry, we only have rooms 100 - 109. We cannot move the pet you are looking for to a room that does not exist.");
        }
        else if (!roomTaken(firstRoomNumber))
        {
            System.out.println("The pet you are looking for is not in room number " + firstRoomNumber + ".");
        }
        else
        {
            if (!roomTaken(secondRoomNumber))
            {
                System.out.println("Sorry, there aren't any pets in this room to swap with!");
            }
            else
            {
                String petInFirstRoom = hotelRooms.get(firstRoomNumber);
                String petInSecondRoom = hotelRooms.get(secondRoomNumber);

                hotelRooms.put(secondRoomNumber, petInFirstRoom);
                hotelRooms.put(firstRoomNumber, petInSecondRoom);
                System.out.println("" + petInFirstRoom + " has been moved to room number " + secondRoomNumber +
                        ", and " + petInSecondRoom + " has been moved to room number " + firstRoomNumber + ".");
            }
        }
    }

    private void moveOver()
    {
        String firstPet = null;

        if (hotelRooms.get(109) != null)
        {
            firstPet = hotelRooms.get(109);
            hotelRooms.remove(109);
        }

        for (int i = 108; i >= 100; i--)
        {
            String currentPet = null;

            if (hotelRooms.get(i) != null)
            {
                currentPet = hotelRooms.get(i);
            }

            if (currentPet != null)
            {
                hotelRooms.put(i + 1, currentPet);
                hotelRooms.remove(i);
            }
        }

        if (firstPet != null)
        {
            hotelRooms.put(100, firstPet);
        }
    }

    private void getOccupancy()
    {
        Set<Map.Entry<Integer, String>> entries = hotelRooms.entrySet();

        for (Map.Entry<Integer, String> entry : entries)
        {
            int roomNumber = entry.getKey();
            String petName = entry.getValue();

            System.out.println("" + petName + " is in room number " + roomNumber + ".");
        }

        //Lambda version:
        // hotelRooms.forEach((roomNumber,petName) -> System.out.println("" + petName + " is in room number " + roomNumber + "."));
    }

    private void closeForSeason()
    {
        hotelRooms.clear();
        System.out.println("We are closed for the rest of the season. Thank you for your patronage!");
    }
}
