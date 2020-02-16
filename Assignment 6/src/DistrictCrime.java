
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class DistrictCrime {

    private Map<String, Set<Integer>> crimeTable;
    public static Map<String, Set<Integer>> districtCrimesMap = new TreeMap<String, Set<Integer>>();

    static {
        districtCrimesMap.put("Little Newark", new TreeSet<Integer>(Arrays.asList(8, 77, 93, 65)));
        districtCrimesMap.put("Springfield Heights", new TreeSet<Integer>(Arrays.asList(8, 14, 15, 31, 33, 47, 77)));
        districtCrimesMap.put("Squidport", new TreeSet<Integer>(Arrays.asList(5, 8, 14, 27, 31, 47, 93)));
        districtCrimesMap.put("Waterfront", new TreeSet<Integer>(Arrays.asList(2)));
    }

    public DistrictCrime() {
        this.crimeTable = new TreeMap<String, Set<Integer>>();
        this.crimeTable.putAll(districtCrimesMap);
    }

    public Map<String, Set<Integer>> getCrimeTable() {
        return this.crimeTable;
    }

    public List<Integer> crimeList() {
        List<Integer> crimeList = new ArrayList<Integer>();
        for (Entry<String, Set<Integer>> crimeMap : getCrimeTable().entrySet()) {
            crimeList.addAll(crimeMap.getValue());
        }
        return crimeList;
    }

    public List<Integer> highlyLocalisedCrimeTypes() {
        List<Integer> highlyLocalisedCrimeTypes = new ArrayList<>();
        for (Integer crimeCode : crimeList()) {
            int a = Collections.frequency(crimeList(), crimeCode);
            if (a==1) {
                highlyLocalisedCrimeTypes.add(crimeCode);
            }
        }
        return highlyLocalisedCrimeTypes;

    }

    @Override
    public String toString() {
        return "DistrictCrime [crimeTable=" + crimeTable + "]";
    }

}
