package chapter6HWproject;
import jsjf.ArrayOrderedList;
import jsjf.ArrayUnorderedList;
import jsjf.LinkedOrderedList;
import jsjf.LinkedUnorderedList;
import jsjf.exceptions.*;
 
/**
 *
 * @author jackjt
 */
public class Chapter6HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	// 1. Complete the incomplete classes
        // 2. In this main, write a test for each method AND any exceptions
        // 3. Push all of the changes back to the repository (git push)
     
        orderedList();
        unorderedList();
        linkedOrderedList();
        lUnorderedList();
    }
    
    private static void orderedList()
    {
        ArrayOrderedList<String> orderedList = new ArrayOrderedList<>();
        
        orderedList.add("13");
        orderedList.add("52");
        orderedList.add("13");
        orderedList.add("54");
        orderedList.add("55");
        
        System.out.println("First Element: " +  orderedList.first());
        System.out.println("Last Element: " + orderedList.last());
        System.out.println("List Elements: " + orderedList.toString());
        
        System.out.println("Remove First Element: " + orderedList.removeFirst());
        System.out.println("Remaining Elements: " + orderedList.toString());
        System.out.println("Remove Last Elemebt: " + orderedList.removeLast());
        System.out.println("Remaining Elements: " + orderedList.toString());
     
        System.out.println("Delete Elements.");
        orderedList.remove("52");
        orderedList.remove("13");
        orderedList.remove("54");
        
        try {
            orderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is it empty? " + orderedList.isEmpty());
    }
    
    private static void unorderedList()
    {
        ArrayUnorderedList<String> unorderedList = new ArrayUnorderedList<>();
        
        unorderedList.addToFront("1");
        unorderedList.addToRear("5");
        unorderedList.addAfter("2", "1");
        unorderedList.addAfter("3", "2");
        unorderedList.addAfter("4", "3");
        
        System.out.println("First Element: " + unorderedList.first());
        System.out.println("Last Element: " + unorderedList.last());
        System.out.println("List Elements: " + unorderedList.toString());
        
        System.out.println("Remove First: " + unorderedList.removeFirst());
        System.out.println("Remaining Elements: " + unorderedList.toString());
        System.out.println("Remove Last: " + unorderedList.removeLast());
        System.out.println("Remaining Elements: " + unorderedList.toString());
        
        unorderedList.remove("2");
        unorderedList.remove("3");
        unorderedList.remove("4");
        
        try {
            unorderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is it empty? " + unorderedList.isEmpty());
    }
    
    private static void linkedOrderedList()
    {
        LinkedOrderedList<String> linkedOrderedList = new LinkedOrderedList<>();
        
        linkedOrderedList.add("1");
        linkedOrderedList.add("2");
        linkedOrderedList.add("3");
        linkedOrderedList.add("4");
        linkedOrderedList.add("5");
        
        System.out.println("First Element: " +  linkedOrderedList.first());
        System.out.println("Last Element: " + linkedOrderedList.last());
        System.out.println("List Elements: " + linkedOrderedList.toString());
        
        System.out.println("Remove First Element: " + linkedOrderedList.removeFirst());
        System.out.println("List Elements: " + linkedOrderedList.toString());
        System.out.println("Remove Last Element: " + linkedOrderedList.removeLast());
        System.out.println("List Elements: " + linkedOrderedList.toString());
     
        System.out.println("Remove Elements.");
        linkedOrderedList.remove("2");
        linkedOrderedList.remove("3");
        linkedOrderedList.remove("4");
        
        try {
            linkedOrderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is it empty? " + linkedOrderedList.isEmpty());
    }
    
    private static void lUnorderedList()
    {
        LinkedUnorderedList<String> linkedUnorderedList = new LinkedUnorderedList<>();
        
        linkedUnorderedList.addToFront("1");
        linkedUnorderedList.addToRear("5");
        linkedUnorderedList.addAfter("2", "1");
        linkedUnorderedList.addAfter("3", "2");
        linkedUnorderedList.addAfter("4", "3");
        
        System.out.println("First Element: " + linkedUnorderedList.first());
        System.out.println("Last Element: " + linkedUnorderedList.last());
        System.out.println("List Elements: " + linkedUnorderedList.toString());
        
        System.out.println("Remove first Element: " + linkedUnorderedList.removeFirst());
        System.out.println("List Elements: " + linkedUnorderedList.toString());
        System.out.println("Remove Last Element: " + linkedUnorderedList.removeLast());
        System.out.println("List Elements: " + linkedUnorderedList.toString());
        
        linkedUnorderedList.remove("2");
        linkedUnorderedList.remove("3");
        linkedUnorderedList.remove("4");
        
        try {
            linkedUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Is it Empty? " + linkedUnorderedList.isEmpty());
    }
}

































