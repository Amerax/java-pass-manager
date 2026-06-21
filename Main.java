import java.util.HashMap;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        HashMap<String, Password> passList = new HashMap<>();

        System.out.println("Hello welcome to java password manager!");
        System.out.println("All of this runs locally without a connection to the internet needed! Superbly safe :O");

        boolean running = true;

        while(running){
            System.out.println("""
                    0: Close program
                    1: Enter new password info
                    2: Access pass info 
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
}
