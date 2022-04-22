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
        List<String> juice = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        Set<Double> set1 = new HashSet<>();

        sfx.add("Bang");
        sfx.add("zap");
        sfx.add("Pow");

        units.add("micro");
        units.add("mini");
        units.add("nano");
        units.add("pico");

        juice.add("Pop");
        juice.add("Bang");
        juice.add("Boom");
        juice.add("Zing");
        juice.add("Pow");

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        set1.add(2.34);
        set1.add(4.44);
        set1.add(5d);

        System.out.println(collectionOperations(sfx));
        System.out.println(collectionOperations(units));
        System.out.println(collectionOperations(juice));
        System.out.println(collectionOperations(ints));
        System.out.println(collectionOperations(set1));
    }

    public static Collection<?> collectionOperations(Collection<?> myCollection) {

        //String Collection case
        if (Arrays.asList(myCollection.toArray()).get(0) != null && Arrays.asList(myCollection.toArray()).get(0).getClass().getSimpleName().equals("String")) {
            System.out.println("Collection of strings");
            return myCollection.stream().map(Object::toString).map(String::toUpperCase).collect(Collectors.toList());
        }

        //Integer Collection Case
        if (Arrays.asList(myCollection.toArray()).get(0) != null && Arrays.asList(myCollection.toArray()).get(0).getClass().getSimpleName().equals("Integer")) {
            System.out.println("Integer Collection");
            List<?> collectionAsList = Arrays.asList(myCollection.toArray());
            Collections.reverse(collectionAsList);
            return collectionAsList;

//            return Collections.reverse(Arrays.asList(myCollection.toArray()));
        }

        System.out.println("Other Collections");
        return myCollection;
    }
}
