import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName = getFirstName(sc);
        System.out.println("The first name entered is : " + firstName);
        String lastName = getLastName(sc);
        System.out.println("The last name entered is : " + lastName);
    }

    public static String getFirstName(Scanner s){
        System.out.println("Enter the first name (first letter must be capital):");
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
        String firstName = s.nextLine();
        Matcher matcher = p.matcher(firstName);
        if(matcher.matches()){
            System.out.println("Valid input");
            return firstName;
        }
        else{
            System.out.println("Invalid input");
            System.out.println("Try again");
            return getFirstName(s);
        }
    }

    public static String getLastName(Scanner s){
        System.out.println("Enter the last name (last name contains atleast"+
           " 3 characters and starts with Capital letter):");
        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
        String lastName = s.nextLine();
        Matcher matcher = p.matcher(lastName);
        if(matcher.matches()){
            System.out.println("Valid last name");
            return lastName;
        }
        else{
            System.out.println("Invalid last name");
            System.out.println("Please try again");
            return getLastName(s);
        }
    }
}
