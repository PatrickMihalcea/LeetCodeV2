import java.util.Arrays;
import java.util.List;

public class InputHelper {
    public static int[] argToIntArray (String listString) {
        // Transform arg list to real list.
        String cleanedString = listString.replaceAll("\\[|\\]|\\s", "");
        String[] elements = cleanedString.split(",");
        List<String> stringList = Arrays.asList(elements);

        int[] array = new int[stringList.size()];
        for (int i = 0; i < stringList.size(); i++) {
            array[i] = Integer.parseInt(stringList.get(i));
        }
        return array;
    }
    public static String[] argToStringArray (String listString) {
        // Transform arg list to real list.
        String cleanedString = listString.replaceAll("\\[|\\]|\\s", "");
        String[] elements = cleanedString.split(",");

        return elements;
    }
}
