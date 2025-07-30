import java.util.*;
public class evenoddchecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
         
        if (number % 2==0){
            System.out.println(number+"is Even.");
        }
        else{
            System.out.println("is odd.");
        }
        scanner.close();
    }
    
}
