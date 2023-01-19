package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample  {
    public void example(){
        Stack<Integer> stack = new Stack<Integer>();


    //pushing or putting something into the stack(FILO, LIFO)
        for(int i = 0; i < 10; i++){
            stack.push(i);
    }

    //pop or taking something from the stack
    for (int i = 0; i < 5; i++){
        Integer stackItem = stack.pop();
        System.out.println("Stack Item (pop): " + stackItem);
       }

       //to see what is the last item on the stack
       Integer item =stack.peek();
       System.out.println(item);
       Integer firstItem = stack.firstElement();
       System.out.println("First element of Stack: "+ firstItem);
    

       //to find out in which position
        Integer idxElement = stack.search(2);
       System.out.println("Stack element found at index " + idxElement);

       Iterator<Integer> its = stack.iterator();

       while(its.hasNext()){
        Integer stackITS = its.next();
        System.out.println("Iterator stack item: "+ stackITS);
       }
    }
    
}
