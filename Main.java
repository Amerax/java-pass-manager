import java.util.HashMap;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Password> passList = new HashMap<>();
    public static void main(String[] args){

        System.out.println("Hello welcome to java password manager!");
        System.out.println("All of this runs locally without a connection to the internet needed! Superbly safe :O");

        boolean running = true;

        while(running){
            System.out.println("""
                    0: Close program
                    1: Save a new password log
                    2: Access saved pass info 
                    """);
                
            int input = sc.nextInt();
            sc.nextLine();
            
            switch (input){
                case 0 -> running = false; 
                case 1 -> newInfo();
                case 2 -> access();
                default -> System.out.println("Invalid selection");
            }
        }
    }

    public void newInfo(){
        System.out.println("Enter the website name you would like to save a password to: ");
        String website = sc.nextLine();
        System.out.println("Enter the username");
        String user = sc.nextLine();
        System.out.println("Enter the password");
        String pass = sc.nextLine();

        Password created = new Password(user, pass, website);

        passList.put(website, created);

        System.out.println("Would you like to put in optional security question information? (y/n)");
        String input = sc.nextLine();
        if(input.equals("y")){
            System.out.println("Enter the security question");
            created.setSecQuestion(sc.nextLine());
            System.out.println("Enter the security question answer");
            created.setSecAns(sc.nextLine());
        }

        System.out.println("Password information succesfully stored!");
    }

    public void access(){
        
    }
}
