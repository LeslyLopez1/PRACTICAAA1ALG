// Java code to illustrate AbstractQueue
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueExample
{
    public static void main(String[] argv) throws Exception
    {
        // Creating object of AbstractQueue<Integer>
        AbstractQueue<Integer> a = new LinkedBlockingQueue<Integer>();

        // Adding elements to the Queue
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        // Print the queue contents to the console
        System.out.println("AbstractQueue contains: " + a);
    }
}