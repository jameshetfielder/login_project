import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;

        System.out.print("Username: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        if(userName.equals("github") && (password.equals("github123"))){
            System.out.print("Login success!");
        }
        else{
            System.out.print("Wrong username or password. \nPlease try again.");
        }
    }
}