package exceptionhandler;

public class MyCheckedException extends Exception {

    public MyCheckedException(String age_must_be_18_or_above) {
        super(age_must_be_18_or_above);
    }
}
