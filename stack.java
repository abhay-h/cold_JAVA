import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<String> Games = new Stack<String>();
        System.out.println(Games.empty());
        Games.push("Call of duty");
        Games.push("Fortnite");
        Games.push("Grand Theft Auto");
        Games.push("GodOFWar");


        System.out.println(Games);
        System.out.println(Games.peek());
        System.out.println(Games.search("Fortnite"));


        System.out.println(Games);


    }
}
