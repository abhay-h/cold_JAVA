import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> Games = new LinkedList<String>();

        Games.offer("Fortnite");
        Games.offer("GOW");
        Games.offer("COD");
        Games.offer("GTA");
        // enqueue = offer()
        // dequeue = poll()
        System.out.println(Games);
        System.out.println(Games.peek());
        System.out.println(Games.poll());
        System.out.println(Games);
        System.out.println(Games.isEmpty());
        System.out.println(Games.contains("GTA"));



    }
}
