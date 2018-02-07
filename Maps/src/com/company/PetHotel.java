package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PetHotel
{
    TreeMap<Integer, String> hotelRooms;
    private Scanner scanner;

    private String petName;
    private int roomNumber;

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

        do
        {
            int fromRoomNumber;
            int toRoomNumber;

            if (hotelRooms.isEmpty())
            {
                System.out.println("There aren't any pets here right now.");
            }

            System.out.print("Enter command: ");
            String inputLine = scanner.nextLine();
            words = inputLine.split(" ");
            command = words[0];

            if (command.equalsIgnoreCase("CheckIn"))
            {
                petName = words[1];
                roomNumber = Integer.parseInt(words[2]);

                boolean roomExists = (roomNumber >= 100 && roomNumber <= 109);

                if (!roomExists)
                {
                    System.out.println("Sorry, we only have rooms 100 - 109. Please select a room that exists.");
                }
                else if (hotelRooms.get(roomNumber) != null)
                {
                    System.out.println("Sorry, this room already has an occupant. Please select a different one.");
                }
                else if (hotelRooms.get(roomNumber) == null)
                {
                    checkIn(petName, roomNumber);
                }
            }
            else if (command.equalsIgnoreCase("CheckOut"))
            {
                String petName = words[1];
                roomNumber = Integer.parseInt(words[2]);

                if (hotelRooms.get(roomNumber) == null)
                {
                    System.out.println("Your pet is not in room number " + roomNumber + ".");
                }
                else
                {
                    boolean roomExists = (roomNumber >= 100 && roomNumber <= 109);
                    boolean isRightPet = hotelRooms.get(roomNumber).equalsIgnoreCase(petName);

                    if (!roomExists)
                    {
                        System.out.println("Sorry, we only have rooms 100 - 109. Please select a room that exists.");
                    }
                    else if (hotelRooms.get(roomNumber) == null)
                    {
                        System.out.println("Sorry, this room is empty.");
                    }
                    else if (!isRightPet)
                    {
                        System.out.println("This is not the pet you're looking for.");
                    }
                    else if (hotelRooms.get(roomNumber) != null)
                    {
                        checkOut(petName, roomNumber);
                    }
                }
            }
            else if (command.equalsIgnoreCase("Move"))
            {
                String petName = words[1];
                fromRoomNumber = Integer.parseInt(words[2]);
                toRoomNumber = Integer.parseInt(words[3]);

                if (hotelRooms.get(fromRoomNumber) == null)
                {
                    System.out.println("Your pet is not in room number " + fromRoomNumber + ".");
                }
                else
                {
                    boolean toRoomExists = (toRoomNumber >= 100 && toRoomNumber <= 109);
                    boolean fromRoomExists = (fromRoomNumber >= 100 && fromRoomNumber <=109);
                    boolean isRightPet = hotelRooms.get(fromRoomNumber).equalsIgnoreCase(petName);

                    if (!fromRoomExists)
                    {
                        System.out.println("Sorry, we only have rooms 100 - 109. " + petName + " is currently in a room that exists. Please try again." );
                    }
                    else if (!toRoomExists)
                    {
                        System.out.println("Sorry, we only have rooms 100 - 109. We cannot move " + petName + " to a room that does not exist.");
                    }
                    else if (hotelRooms.get(toRoomNumber) != null)
                    {
                        System.out.println("Sorry, room number " + toRoomNumber + " already has an occupant. Please select a different one.");
                    }
                    else if (!isRightPet)
                    {
                        System.out.println("This is not the pet you're looking for.");
                    }
                    else
                    {
                        move(petName,fromRoomNumber,toRoomNumber);
                    }
                }
            }
            else if (command.equalsIgnoreCase("Occupancy"))
            {
                getOccupancy();
            }
            else if (command.equalsIgnoreCase("CloseForSeason"))
            {
                closeForSeason();

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

    private void checkIn(String petName, int roomNumber)
    {
        hotelRooms.put(roomNumber, petName);
        System.out.println("" + petName + " checked into room " + roomNumber + ".");

        System.out.println(hotelRooms);
    }

    private void checkOut(String petName, int roomNumber)
    {
        hotelRooms.remove(roomNumber, petName);
        System.out.println("" + petName + " has been checked out of room number " + roomNumber + ".");

        System.out.println(hotelRooms);
    }

    private void move(String petname, int fromRoomNumber, int toRoomNumber)
    {
        hotelRooms.remove(fromRoomNumber);
        hotelRooms.put(toRoomNumber, petname);
        System.out.println("" + petname + " has been moved from room number " + fromRoomNumber + " to room number " + toRoomNumber + ".");

        System.out.println(hotelRooms);
    }

    private void getOccupancy()
    {
        hotelRooms.forEach((roomNumber,petName) -> System.out.println("" + petName + " is in room number " + roomNumber + "."));
    }

    private void closeForSeason()
    {
        hotelRooms.clear();
        System.out.println("We are closed for the rest of the season. Thank you for your patronage!");
    }

}
