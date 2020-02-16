
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class UFOSurvey {

    private SortedMap<Integer, Set<String>> alienSightings;


//from java 7 onwards these angular brackets should be compulsary on lefthandside but need not be on righthandside
    private static Map<Integer, Set<String>> alienSightingsMap = new TreeMap<>();

    //treemap is used to sort in ascending order
   // Set<String> will take list of strings
    //angular brackets are called generics

    //static block
        static {
            alienSightingsMap.put(52, new HashSet<String>(Arrays.asList("Azure","Lime","Purple")));
            alienSightingsMap.put(49, new HashSet<String>(Arrays.asList("Honey Dew","Ash","Red")));
            alienSightingsMap.put(48, new HashSet<String>(Arrays.asList("Coral")));
            alienSightingsMap.put(51, new HashSet<String>(Arrays.asList("Purple","Navy","Teal","Coral")));
            alienSightingsMap.put(50, new HashSet<String>(Arrays.asList("Red","Indigo")));
        }

      //constructor
        public UFOSurvey() {
            this.alienSightings = new TreeMap<Integer, Set<String>>();
            this.alienSightings.putAll(alienSightingsMap);
        }

        public Map<Integer, Set<String>> getAlienSightings() {
            return this.alienSightings;
        }

        public boolean addSighting(final Integer areaCode, final String colour) {
            if (getAlienSightings().get(areaCode) != null) {
                if (getAlienSightings().get(areaCode).contains(colour)) {
                    System.out.println("Colour already exists!");
                    return false;
                } else {
                    getAlienSightings().get(areaCode).add(colour);
                    System.out.println("Colour added to the existing sighting!");
                    return true;
                }
            }
            Set<String> colours = new HashSet<String>();
            colours.add(colour);
            getAlienSightings().put(areaCode, colours);
            System.out.println("New sighting added!");
            return true;
        }

        public Set<Integer> findAreasForColour(final String color) {
            Set<Integer> areas = new HashSet<Integer>();
            for (Entry<Integer, Set<String>> alienSighting : getAlienSightings().entrySet()) {
                if (alienSighting.getValue().contains(color)) {
                    areas.add(alienSighting.getKey());
                }
            }
            return areas;

        }

        @Override
        public String toString() {
            return "UFOSurvey [alienSightings=" + alienSightings + "]";
        }


    }













