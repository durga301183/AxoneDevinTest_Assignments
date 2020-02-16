public class UFOSurveyDemo {

    public static void main(String[] args) {
            UFOSurvey survey = new UFOSurvey(); // creates an object with the initial implementation of the alien sightings table

            //Adding a new sighting
            survey.addSighting(60, "Red");

            //Adding new colour to existing sighting
            survey.addSighting(60, "Yellow");

            System.out.println(survey);

            //Adding exiting colour to existing sighting
            survey.addSighting(60, "Yellow");

            System.out.println(survey);

            System.out.println("Yellow colour is mapped for areas :"+survey.findAreasForColour("Yellow"));
            System.out.println("Red colour is mapped for areas :"+survey.findAreasForColour("Red"));
            System.out.println("Purple colour is mapped for areas :"+survey.findAreasForColour("Purple"));
            System.out.println("Coral colour is mapped for areas :"+survey.findAreasForColour("Coral"));
            System.out.println("White colour is mapped for areas :"+survey.findAreasForColour("White"));



            survey.findAreasForColour("yellow");
        }




    }


