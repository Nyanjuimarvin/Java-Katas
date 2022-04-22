package CollectionOps;

/*
*
* Context: A common operation is needing to
*  swap the order of items in a collection of data
*  Task: Create a program that will:
* - reverse the order of a list if the list consists of integers alone,
* - convert the list items to uppercase if the list contains words only.
* - return the same list if the list members don’t satisfy either of these two criteria

* */

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOps {
    public static void main(String[] args) {
        List<String> sfx = new ArrayList<>();
        Set<String> units = new HashSet<>();
        sfx.add("Bang");
        sfx.add("zap");
        sfx.add("Pow");

        units.add("micro");
        units.add("mini");
        units.add("nano");
        units.add("pico");

        System.out.println(collectionOperations(sfx));
        System.out.println(collectionOperations(units));
    }

    public static Collection<?> collectionOperations(Collection<?> myCollection){

        //String case
        if(Arrays.asList(myCollection.toArray()).get(0) != null && Arrays.asList(myCollection.toArray()).get(0).getClass().getSimpleName().equals("String")){
            System.out.println("Collection of strings");
            return myCollection.stream().map(Object::toString).map(String::toUpperCase).collect(Collectors.toList());
        }
        return myCollection;
    }
}
