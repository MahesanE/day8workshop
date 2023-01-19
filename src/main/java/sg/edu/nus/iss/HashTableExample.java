package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public void example(){
        //cannot run on multithread
        Map<String,Integer> phones = new Hashtable<>();

        phones.put("IPhone", 10);
        phones.put("Samsung", 9);
        phones.put("Oppo", 4);
        phones.put("Oneplus", 7);
        phones.put("Google",6);

        System.out.println("Total phone types: "+ phones.size());

        for(String key : phones.keySet()){
            System.out.println(key + " - "+ phones.get(key));
        }

        Console cons = System.console();
        String searchString = "";
        
        while(!searchString.equalsIgnoreCase("quit")){
        searchString = cons.readLine("Enter searchString: ");
        
        if(phones.containsKey(searchString)){
            System.out.println(searchString + " - "+ phones.get(searchString));
        } else {
            System.out.println("This is non existent hoeeeee");
        }
    }

    // remove Map data
    phones.clear();

    //check if the map has been cleared 
    System.out.println("Total phone types: "+ phones.size());

    }
    

}
