
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ArrayToCollectionConversionDemo {

        public static void main(String[] args) {
            //initialised string array

            String[] phrase = new String[]{"The","Cat","sat","on","The","mat"};

            //method is called and put under an variable which is printed

            List<String> phraseList = arrayToArrayList(phrase);
            System.out.println("The converted phrase array to phrase list is :"+phraseList);

            Set<String> phraseSet = arrayToHashSet(phrase); // Note the difference in the order.
            System.out.println("The converted phrase array to phrase set is :"+phraseSet);

            Map<Integer, String> phraseMap = arrayToHashMap(phrase);
            System.out.println("The converted phrase array to phrase map is :"+phraseMap);
        }

        private static Map<Integer, String> arrayToHashMap(String[] phrase) {
            Map<Integer, String> phraseMap = new HashMap<Integer, String>();
            for (int i = 0; i < phrase.length; i++) {
                phraseMap.put(i+1, phrase[i]);
            }
            return phraseMap;
        }

        private static Set<String> arrayToHashSet(String[] phrase) {
            //Method 1
            Set<String> phraseSet = new HashSet<String>();
            for (int i = 0; i < phrase.length; i++) {
                phraseSet.add(phrase[i]);
            }
//		System.out.println("Array to Set [Method 1] :"+phraseSet);

            //Method 2
            Set<String> phraseSet2 = new HashSet<String>(Arrays.asList(phrase));
//		System.out.println("Array to Set [Method 2] :"+phraseSet2);
            return phraseSet;
        }

        private static List<String> arrayToArrayList(String[] phrase) {

            //Method 1
            ArrayList<String> phraseList = new ArrayList<>();
            // even better way to create ArrayList is to use Interface type -> List<String> phraseList = new ArrayList<>();
            // if you use the interface, at any point later on you can convert into any other list like linkedlist and so on.
            // See Method 2 below.

            for (int i = 0; i < phrase.length; i++) {
                phraseList.add(phrase[i]);
            }

//		System.out.println("Array to List [Method 1] :"+phraseList);

            //Method 2
            List<String> phraseList2 = Arrays.asList(phrase);

            System.out.println("Array to List [Method 2] :"+phraseList2);
            return phraseList2;
        }

    }















