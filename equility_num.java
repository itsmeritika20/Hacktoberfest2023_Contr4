//equality of number
import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b){
                System.out.println(a + " and" +  b + " are equal");
            }
            else if (a>b) {
                System.out.println(a + "is bigger");
            }
            else
            {
                System.out.println(b + "is bigger");
            }
        }
    }
}
