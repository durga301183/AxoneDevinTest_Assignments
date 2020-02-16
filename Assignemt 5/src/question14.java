public class question14 {

    static void learnExceptionHandling() {
        String str;
        try {
            str="Hello World";
        } catch (Exception ex) {
            ex.printStackTrace();   // no errors just goes to execute finally block
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {
            str="I'm done";
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        learnExceptionHandling();
    }
}
