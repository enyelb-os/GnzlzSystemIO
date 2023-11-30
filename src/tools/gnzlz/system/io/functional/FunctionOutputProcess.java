package tools.gnzlz.system.io.functional;

@FunctionalInterface
public interface FunctionOutputProcess {

    void print(String text);

    default void print(boolean validate, String text){
        if (validate) {
            this.print(text);
        }
    }

    /**
     * println
     * @param text text
     */

    default void println(String text){
        this.print(text + System.lineSeparator());
    }

    /**
     * println
     * @param validate validate
     * @param text text
     */
    default void println(boolean validate, String text){
        if (validate) {
            this.println(text);
        }
    }

    /**
     * ln
     */

    default void ln(){
        this.print(System.lineSeparator());
    }

    /**
     * ln
     * @param validate validate
     */
    default void ln(boolean validate){
        if (validate) {
            this.ln();
        }
    }

    /**
     * repeat
     * @param n n
     * @param c char
     */

    default void repeat(int n, String c){
        println(c.repeat(n));
    }

    /**
     * center
     * @param text text
     * @param n n
     */

    default void center(String text, int n){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            s.append(" ");
            if((s.length() * 2) + text.length() > n){
                break;
            }
        }
        this.println(s + text);
    }

    /**
     * title
     * @param text text
     * @param n n
     * @param c char
     */

    default void title(String text, int n, String c){
        this.repeat(n, c);
        center(text, n);
        repeat(n, c);
    }
}
