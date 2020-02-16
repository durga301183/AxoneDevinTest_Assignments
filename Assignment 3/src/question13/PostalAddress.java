package question13;

public class PostalAddress {

    /**
     * first line of the address which can be house number.
     **/
    private String firstLine;
    /**
     * second line of the address which can hold street or county.
     **/
    private String secondLine;
    /**
     * postal code.
     **/
    private String postCode;

    /**
     * no match.
     **/
    private static final String NO_MATCH = "No match!"; //constants

    //constructor with three formal arguments
    public PostalAddress(String firstLine, String secondLine, String postCode) {

        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.postCode = postCode;
    }

    /**
     * Gives the delivery information in terms of
     * last three characters of the postal code.
     *
     * @return last three characters of the postal code
     */
    public String getDeliveryInfo() {

        //return postCode.substring(postCode.length()-3, postCode.length());

        return postCode.substring(postCode.length() - 3);
    }



    public String getAddress(String postCode) {

        //It returns true if characters of both strings are equal ignoring case otherwise false.

        if (postCode.equalsIgnoreCase(this.postCode)) {

            return this.firstLine + " " + this.secondLine + " " + this.postCode;
        } else {
            return NO_MATCH;
        }
    }
}













