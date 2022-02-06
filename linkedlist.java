import java.util.LinkedList;

public class linkedlist {


    public static void main(String[] args) {

        LinkedList Names = new LinkedList<>();
        Names.push("whistle");
        Names.push("ray");
        Names.push("zap");
        Names.push("kian");
        Names.push("swastik");
        Names.offer("ZEUS");
        Names.pop();
        Names.remove("ZEUS");
        System.out.println(Names);
        System.out.println(Names.peekLast());
        System.out.println(Names.peekFirst());
        Names.addFirst("naruto");
        Names.addLast("kakashi");

        System.out.println(Names);


    }

}