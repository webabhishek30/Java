package Loop;
import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Enter the number
        int number = scan.nextInt();
        int result = 1;
        if(number >= 2) {
            int i = number;
            while(i >= 1) {
                if((i & (i - 1)) == 0){
                    result = i;
                    break;
                }
                i--;
            }
        System.out.print(result);

        } else {
            System.out.print("Please enter an integer >= 2");
        }
    scan.close();
    }
}
