import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String firstInitial;
        String lastName;
        String houseNumber;
        String streetName;
        String streetType;
        String city;

        System.out.println("Enter first inital: ");
        firstInitial = keyboard.next();
        System.out.println("Enter last name: ");
        lastName = keyboard.next();
        System.out.println("Enter house number: ");
        houseNumber = keyboard.next();
        System.out.println("Enter street name: ");
        streetName = keyboard.next();
        System.out.println("Enter street type: ");
        streetType = keyboard.next();
        System.out.println("Enter city: ");
        city = keyboard.next();


     System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");

     System.out.println(streetName + " " + streetType + " " + city);
    }
}