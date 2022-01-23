import java.util.Scanner;

public class Cal{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number ");
        int Number1 = sc.nextInt();
        System.out.println("Enter a Second number ");
        int Number2 = sc.nextInt();
        _Addition(Number1, Number2);
        System.out.println("The multiplication = "+Multiply(Number1, Number2));

        System.out.println("The division is = "+ Divide(Number1, Number2));
    }




       public static void _Addition(int num1, int num2){

           int sum = num1+num2;
           System.out.println("The addition is = "+sum);
        }

        public  static int Multiply(int num1, int num2) {

        int answer = num1*num2;

        return answer;
        }

    public  static int Divide(int num1, int num2){

        int answer = num1/num2;
        return answer ;
    }



}
