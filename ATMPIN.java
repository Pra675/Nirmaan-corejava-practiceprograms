import java.util.Scanner;
public class ATMPIN{
    public static void main(string[]args){
        Scanner sc=new Scanner (system.in);
        int correctpin = 1234;
        System.out.print("Enter ATM PIN:");
        int pin=sc.nextln();
        if(pin==correctpin){
            System.out.println("Access Granted");
        }else{
            System.out.println("invalid PIN");
            
        }    
        }
        
    }
}