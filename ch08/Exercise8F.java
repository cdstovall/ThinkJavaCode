import java.util.Arrays;
import java.util.Scanner;

public class Exercise8F
{
    public static void main(String[] args)
    {
        petNames();
    }

    private static void petNames()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many pets do you have? ");
        int numberOfPets = in.nextInt();
        in.nextLine();

        String[] petNames = new String [numberOfPets];

        int currentPet = 0;

        while (currentPet < numberOfPets)
        {
            System.out.println("What is the name of pet number " + (currentPet + 1) + "? ");
            petNames [currentPet] = in.nextLine();
            currentPet++;
        }

        System.out.println("The names of your pets are" + Arrays.toString(petNames) + ".");

    }


}
