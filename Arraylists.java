import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("enter elements ");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);
        }


            System.out.println(list);

    }
}
