package Assignment2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Collection interface objects
        Stack s = new Stack();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();

        //Stack example
        System.out.println("Stack\n============\nStack is Empty :" +s.isEmpty());//return true
        s.push(10);//push 10 into the stack
        s.push(20);//push 20 into the stack
        s.push(30);//push 30 into the stack
        System.out.println(s.pop() + " Popped");//pop 30 from stack
        s.push(90);//push 90 into the stack
        System.out.println(s.remove(1) + " was removed from the list");
        System.out.println(s.peek() + " is on top of the list");//return top value from stack
        System.out.println("Stack is Empty :" +s.isEmpty());//return false


        //LinkedHashSet Example
        linkedHashSet.add("Element 1");
        linkedHashSet.add("Element 2");
        linkedHashSet.add("Element 3");
        linkedHashSet.add("Element 4");
        System.out.println("\nLinkedHashSet\n==============\nThe number of elements added in the LinkedHashSet is " + linkedHashSet.size());//display size
        System.out.println("Size of list using size method: " + linkedHashSet.size());
        System.out.println("Contains: "+ linkedHashSet);//display elements


        hashMap.put("key1", "apple");
        hashMap.put("key2", "orange");
        hashMap.put("key3", "banana");
        hashMap.put("key4", "kiwi");
        System.out.println("\nHashMap\n============\nHashMap list contains: " + hashMap);
        System.out.println("Removing "+ hashMap.remove("key3"));
        System.out.println("New list: " + hashMap);



    }
}
