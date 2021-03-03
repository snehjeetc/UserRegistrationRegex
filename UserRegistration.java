import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName = getFirstName(sc);
        System.out.println("The first name is : " + firstName);
        String lastName = getLastName(sc);
        System.out.println("The last name is : " + lastName);
        String phoneNumber = getPhoneNumber(sc);
        System.out.println("The phone number is : " + phoneNumber);
        String email = getEmail(sc);
        System.out.println("The email id is : " + email);
        String password = getPassword(sc);
        System.out.println("The password is : " + password);
        sc.close();

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

    public static String getPhoneNumber(Scanner s){
        System.out.println("Enter the phone number:");
        String phoneNumber = s.nextLine();
        Pattern p = Pattern.compile("^(\\+?\\d{1,3}|\\d{1,4})\\s[1-9][0-9]{9}");
        Matcher matcher = p.matcher(phoneNumber);
        if(matcher.matches()){
            System.out.println("Valid phone number");
            return phoneNumber;
        }
        else{
            System.out.println("Invalid phone number");
            return getPhoneNumber(s);

        }
    }

    public static String getEmail(Scanner s){
        System.out.println("Enter the email address:");
        String email = s.nextLine();
        Pattern p = Pattern.compile("^([a-zA-Z0-9+-](\\.?[a-zA-Z0-9_])*@[a-zA-Z]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$");
        Matcher matcher = p.matcher(email);
        if(matcher.matches()){
            System.out.println("Valid email id");
            return email;
        }
        else{
            System.out.println("Invalid email id");
            return getEmail(s);

        }
    }

    public static String getPassword(Scanner sc) {
        System.out.println("Enter password "
                + "(must conatain atleast a uppercase, "
                + "lowercase, digit and "
                + "exactly one special character "
                + "of minimum length 8):  ");
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}");
        String passWord = sc.nextLine();
        Matcher matcher = p.matcher(passWord);
        if(matcher.matches()) {
            System.out.println("Valid password");
            return passWord;
        }
        else {
            System.out.println("Invalid password");
            return getPassword(sc);
        }
    }
}

