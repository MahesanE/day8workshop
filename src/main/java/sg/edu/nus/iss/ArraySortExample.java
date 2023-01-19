package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public void example(){
        //custom array with data (name)
        String name[]={ "tim","tom","jon","james","chris","jack","mark","sophia","red","black","white",
        "rashford","marcus","daniel"};

        //names in no order
        System.out.println("Unsorted names: "+ Arrays.toString(name));

        //sort the array in ascending order
        Arrays.sort(name);

        //printing out the sorted array
        System.out.println("Names in ascending order: "+ Arrays.toString(name));

        //sort the array in descending order
        Arrays.sort(name, Collections.reverseOrder());

        //printing out in reverse order
        System.out.println("Names in descending order: " + Arrays.toString(name));
    }

    public void example2() {
        Integer numbers [] = {10,4,5,2,3,7,6};
        //int[] numbers = {10,4,5,2,3,7,6};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers,Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));


    }
    
}
