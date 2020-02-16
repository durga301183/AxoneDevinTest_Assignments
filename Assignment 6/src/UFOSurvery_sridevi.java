import java.util.*;

public class UFOSurvery_sridevi {

    // key pair value so using Map with integer as the area code is integer and since no string to be repeated set is used

    private Map<Integer, Set<String>> alienSightings;

    public UFOSurvery_sridevi() {
        //  UFOSurvery_sridevi obj = new UFOSurvery_sridevi();
        // alien Sightings is null
        alienSightings = new TreeMap<>(); //sorting ascending order

    }

    public boolean addSightings(int areacode, String colour) {

        Set<String> colourset;
        boolean message;

        if (alienSightings.containsKey(areacode)) //passing the areacode
        {
            colourset = alienSightings.get(areacode);//getting the colours
            colourset.add(colour); //adding the colours to the set
            alienSightings.put(areacode, colourset);// brings in areacode,  colourset

            System.out.println("colour is changed with chnage in areacode");
            message = true;

        } else {

            colourset = new TreeSet<>();
            colourset.add(colour);
            alienSightings.put(areacode, colourset);
            System.out.println("no changes");
            message = false;
        }
        return message;
    }
/*
       public List<Integer> findAreasForColour(String colour){
        List<Integer> areaList = new LinkedList<>();
        for(Map.Entry<Integer, Set<String>>entry : alienSightings.entrySet()){
            Set<String> colourSet = entry.getValue();
            if(colourSet.contains(colour)){
                areaList.add(entry.getKey());
            }
        }
        return areaList;
        */
    //alternative method

    public Set<Integer> findAreasForColour(final String color) {
        Set<Integer> areas = new HashSet<Integer>();
        for (Map.Entry<Integer, Set<String>> alienSighting : alienSightings.entrySet()) {
            if (alienSighting.getValue().contains(color)) {
                areas.add(alienSighting.getKey());
            }


        }
        return areas;
    }

}







