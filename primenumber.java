import java.util.*;

public class primenumber {
    public static void main(String[] args) {
        int n = 6;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;

            }

        }
        if (counter == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not prime number");
        }

    }

}
