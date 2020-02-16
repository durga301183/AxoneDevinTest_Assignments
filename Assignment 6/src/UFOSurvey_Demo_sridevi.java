import java.sql.SQLOutput;

public class UFOSurvey_Demo_sridevi {


    public static void main(String[] args) {


        UFOSurvery_sridevi survey = new UFOSurvery_sridevi();

        System.out.println(survey.addSightings(52, "Azure"));
        System.out.println(survey.addSightings(52, "Lime"));
        System.out.println(survey.addSightings(52, "purple"));

        System.out.println(survey.addSightings(49, "honeydew"));
        System.out.println(survey.addSightings(49, "ash"));
        System.out.println(survey.addSightings(49, "red"));

        //System.out.println(survey.getClass());

        System.out.println(survey.addSightings(32, "pink"));

        System.out.println(survey);

        System.out.println(" colour is mapped for areas :" + survey.findAreasForColour("red"));


    }
}
