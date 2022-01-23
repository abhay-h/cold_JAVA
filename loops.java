import java.util.Scanner;

public class loops {


    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int Num = sc.nextInt();
        System.out.println("For loop**************************");
        _Floop(Num);
        System.out.println("While loop**************************");
        _Wloop(Num);
        System.out.println("DO While loop**************************");
       _DWloop(Num);

    }

    public static void _Floop(int Num) {


        for (int i = 0; i <=99; ++i){
           ++Num;
            System.out.println(Num);
        }


    }

    public static  void _Wloop(int Num) {

        while (Num<=99){

            System.out.println(Num);
            ++Num;
        }
    }


    public static void _DWloop(int Num) {

        do {
            System.out.println(Num);
            ++Num;
        }
        while (Num<=99);
    }


}
