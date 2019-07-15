import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 2. Write a generic method that takes an array of objects and a collection,
 * and puts all objects in the array into the collection.
 */

public class ArrayObjectsPutsCollection {
    public static <T, G> List<G> arrayToList(T[] a, Function<T, G> mapFunct) {
        return Arrays.stream(a).map(mapFunct).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Integer[] array = {222,333,444, 1};
        List<String> stringList = arrayToList(array, Object::toString);
        for (String stringListElem: stringList)
            System.out.println(stringListElem);
    }
}
