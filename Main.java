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

    public static void newInfo(){
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

    public static void access(){
        if(passList.isEmpty()){
            System.out.println("Error, no password entries created, please create an entry to access");
        }
        else{
            System.out.println("Here is a list of the websites you have info for: ");
            for(String website : passList.keySet()){
                System.out.println("-" + website);
            }

            System.out.println("Enter the website entry you would like to access");
            Password selcted = passList.get(sc.nextLine());

            if(selcted == null) System.out.println("Invalid entry!");
            else{
                System.out.println("""
                        What would you like to access?
                        1 - Password
                        2 - Security Question 
                        3 - Security Question Answer
                        4 - Username
                        """);

                int result = sc.nextInt();
                sc.nextLine();

                switch(result){
                    case 1 : System.out.println(selcted.getPass()); break;
                    case 4 : System.out.println(selcted.getUser()); break;
                    case 3: {
                        if(selcted.getSecAns() != null){
                            System.out.println(selcted.getSecAns());
                        }
                        else{
                            System.out.println("You did not set a secutiry question answer.");
                        }
                        break;
                    }
                    case 2: {
                        if(selcted.getSecQuesion() != null){
                            System.out.println(selcted.getSecQuesion());
                        }
                        else{
                            System.out.println("You did not set a secutiry question.");
                        }
                        break;
                    }
                    default:{
                        System.out.println("Invalid input");
                    }

                }
            }
            
            
        }
    }
}
