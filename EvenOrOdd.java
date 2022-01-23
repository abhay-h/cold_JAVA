import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

         _CheckEve_Odd(Num);


    }

        public  static  void _CheckEve_Odd(int Num) {

            if (Num==0){
                System.out.println("Zero is not even nor odd");

        }
            else if (Num%2==0){
                System.out.println("The number is even ");

            }
            else{
                System.out.println("Number is odd ");
            }

        }

}
