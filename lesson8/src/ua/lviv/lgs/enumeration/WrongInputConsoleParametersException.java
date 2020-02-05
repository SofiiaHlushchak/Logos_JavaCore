package ua.lviv.lgs.enumeration;
/**
 * @since java 1.8
 * @author Sonia Glushchak
 * @version 1.1
 */
public class WrongInputConsoleParametersException extends Throwable {

    /**
     * @param args
     * @throws WrongInputConsoleParametersException
     * @author Sonia Glushchak
     * @return null
     * @see java code convention
     */

    String month;

    public WrongInputConsoleParametersException(String month) {
        super();
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

}
