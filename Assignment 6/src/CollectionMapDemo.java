import java.util.HashMap;
import java.util.Map;

/*
1) If you do not want to have duplicate values in the database then Set should be your first choice as all of its classes do not allow duplicates.
2) If there is a need of frequent search operations based on the index values then List (ArrayList) is a better choice.
3) If there is a need of maintaining the insertion order then also the List is a preferred collection interface.
4) If the requirement is to have the key & value mappings in the database then Map is your best bet.

 */

public class CollectionMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<String, Integer>();
        ageMap.put("Anna", 33);
        ageMap.put("Ben", 45);
        System.out.println(ageMap);
        ageMap.put("Ben", 33);
        System.out.println(ageMap);
        ageMap.put("Chas", 33);
        System.out.println(ageMap);

        ageMap.keySet().remove("Anna");
        ageMap.values().remove(33);

        System.out.println(ageMap);
    }
}















