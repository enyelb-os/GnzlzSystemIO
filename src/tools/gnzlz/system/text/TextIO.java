package tools.gnzlz.system.text;
public class TextIO {

    /**
     * separator
     */
    public static int separator = 100;

    /**
     * repeat
     * @param c char
     * @param n n
     */
    public static String repeat(String c, int n){
        return c.repeat(n);
    }

    /**
     * repeat
     * @param c char
     */
    public static String repeat(String c){
        return c.repeat(TextIO.separator);
    }

    /**
     * center
     * @param text text
     * @param c char
     * @param n n
     */
    public static String center(String text, String c, int n){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            s.append(c);
            if((s.length() * 2) + text.length() > n){
                break;
            }
        }
        return s + text + repeat(c, n - (text.length() + s.length()));
    }

    /**
     * center
     * @param text text
     * @param n n
     */
    public static String center(String text, int n) {
        return center(text, " ", n);
    }

    /**
     * center
     * @param text text
     */
    public static String center(String text) {
        return center(text, " ", TextIO.separator);
    }

    /**
     * center
     * @param text text
     * @param c char
     */
    public static String center(String text, String c) {
        return center(text, c, TextIO.separator);
    }

    /**
     * left
     * @param text text
     * @param c char
     * @param n n
     */
    public static String left(String text, String c , int n){
        return text + repeat(c, n - (text.length()));
    }

    /**
     * left
     * @param text text
     * @param n n
     */
    public static String left(String text, int n) {
        return left(text, " ", n);
    }

    /**
     * left
     * @param text text
     */
    public static String left(String text) {
        return left(text, " ", TextIO.separator);
    }

    /**
     * left
     * @param text text
     * @param c char
     */
    public static String left(String text, String c) {
        return left(text, c, TextIO.separator);
    }

    /**
     * right
     * @param text text
     * @param c char
     * @param n n
     */
    public static  String right(String text, String c , int n){
        return repeat(c, n - (text.length())) + text;
    }

    /**
     * right
     * @param text text
     * @param n n
     */
    public static String right(String text, int n) {
        return right(text, " ", n);
    }

    /**
     * right
     * @param text text
     */
    public static String right(String text) {
        return right(text, " ", TextIO.separator);
    }

    /**
     * right
     * @param text text
     * @param c char
     */
    public static String right(String text, String c) {
        return right(text, c,  TextIO.separator);
    }
}
