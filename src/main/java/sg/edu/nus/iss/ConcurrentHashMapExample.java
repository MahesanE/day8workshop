package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void example(){
        Map<String,Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Microsoft", 7);
        laptops.put("Apple",3);
        laptops.put("MSI",10);
        laptops.put("Acer",8);
        laptops.put("Asus",54);

        //get the total size of the map objects
        System.out.println("Total laptops: "+laptops.size());

        for(String key : laptops.keySet()){
            System.out.println(key + " - "+ laptops.get(key));
        }

        String searchString = "Asus";
        if(laptops.containsKey(searchString)){
            System.out.println(searchString+ " - "+ laptops.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>)laptops).elements();
        while(elems.hasMoreElements()){
            System.out.println(elems.nextElement());
        }
        Integer retValue = laptops.putIfAbsent(searchString, 10);
        if(retValue != null){
            System.out.println("Item found: " + retValue);

            retValue = laptops.putIfAbsent("Dell", 19);
            for(String key : laptops.keySet()){
                System.out.println(key + " - "+ laptops.get(key));
            }
        }
    }
    
}
