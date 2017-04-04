package chapter5HWproject;
import jsjf.CircularArrayQueue;
import jsjf.LinkedQueue;
import jsjf.exceptions.*;
 
/**
 *
 * @author jackjt
 */
public class Chapter5HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the CirucularArrayQueue and LinkedQueue classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
        myQueue();
        linkedQueue();
    }
    private static void myQueue()
    {
        CircularArrayQueue<String> myQueue = new CircularArrayQueue<>();
        
        myQueue.enqueue("5");
        myQueue.enqueue("3");
        myQueue.enqueue("7");
        myQueue.enqueue("2");
        myQueue.enqueue("9");
        
        System.out.println("Size: " + myQueue.size() );
        System.out.println("First Element: " + myQueue.first());
        System.out.println("Queue Elements: " + myQueue.toString());
        
        System.out.println("Emptying the queue . . . \n\n");
        
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        
        try
        {
            myQueue.dequeue();
        }
        catch(EmptyCollectionException e)
        {
            System.out.println(e.getMessage());    
        }
        
        System.out.println("Is it empty? \n\n" + myQueue.isEmpty());
        
    }
    
    private static void linkedQueue()
    {
        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        
        linkedQueue.enqueue("12");
        linkedQueue.enqueue("202");
        linkedQueue.enqueue("32");
        linkedQueue.enqueue("44");
        linkedQueue.enqueue("98");
        
        System.out.println("Size: " + linkedQueue.size() );
        System.out.println("First Element: " + linkedQueue.first());
        System.out.println("Queue Elements: " + linkedQueue.toString());
        
        System.out.println("Emptying the queue . . . \n\n");
        
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        
        try
        {
            linkedQueue.dequeue();
        }
        catch(EmptyCollectionException e)
        {
            System.out.println(e.getMessage());    
        }
        
        System.out.println("Is it empty? " + linkedQueue.isEmpty());
    }
    
}

































