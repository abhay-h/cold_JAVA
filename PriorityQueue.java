import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {

        Queue Marks = (Queue) new linkedlist();


        Marks.offer(87.5);
        Marks.offer(86.8);
        Marks.offer(80.51);
        Marks.offer(47.5);
        Marks.offer(45.5);
        Marks.offer(46.5);



        while (!Marks.isEmpty()) {
            System.out.println(Marks.poll());
        }


    }

}
