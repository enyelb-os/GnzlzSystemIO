package tools.gnzlz.system.io.functional;

import tools.gnzlz.system.io.SystemIO;
import tools.gnzlz.system.text.TextIO;

import java.io.IOException;

@FunctionalInterface
public interface FunctionOutputProcess {

    /**
     * clearConsole
     */
    default void clearConsole(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec(new String[]{"clear"});
            }
        } catch (IOException | InterruptedException ignored) {}
    }

    /**
     * print
     * @param text text
     */
    void print(String text);

    /**
     * print
     * @param text text
     */
    default void print(boolean validate, String text){
        if (validate) {
            print(text);
        }
    }

    /**
     * println
     * @param text text
     */
    default void println(String text){
        print(text + System.lineSeparator());
    }

    /**
     * println
     * @param validate validate
     * @param text text
     */
    default void println(boolean validate, String text){
        if (validate) {
            println(text);
        }
    }

    /**
     * ln
     */

    default void ln(){
        print(System.lineSeparator());
    }

    /**
     * ln
     * @param validate validate
     */
    default void ln(boolean validate){
        if (validate) {
            ln();
        }
    }

    /**
     * printRepeat
     * @param c char
     * @param n n
     */

    default void printRepeat(String c, int n){
        print(TextIO.repeat(c, n));
    }

    /**
     * printRepeat
     * @param c char
     */

    default void printRepeat(String c){
        print(TextIO.repeat(c));
    }

    /**
     * printlnRepeat
     * @param c char
     * @param n n
     */

    default void printlnRepeat(String c, int n){
        println(TextIO.repeat(c, n));
    }

    /**
     * printlnRepeat
     * @param c char
     */

    default void printlnRepeat(String c){
        println(TextIO.repeat(c));
    }

    /**
     * printCenter
     * @param text text
     * @param n n
     */

    default void printCenter(String text, int n){
        print(TextIO.center(text, n));
    }

    /**
     * printCenter
     * @param text text
     */

    default void printCenter(String text){
        print(TextIO.center(text));
    }

    /**
     * printlnCenter
     * @param text text
     * @param n n
     */

    default void printlnCenter(String text, int n){
        println(TextIO.center(text, n));
    }

    /**
     * printlnCenter
     * @param text text
     */

    default void printlnCenter(String text){
        println(TextIO.center(text));
    }

    /**
     * printlnTitle
     * @param text text
     * @param c char
     * @param n n
     */
    default void printlnTitle(String text,String c, int n){
        printlnRepeat(c, n);
        printlnCenter(text, n);
        printlnRepeat(c, n);
    }

    /**
     * printlnTitle
     * @param text text
     * @param c char
     */
    default void printlnTitle(String text,String c){
        printlnRepeat(c);
        printlnCenter(text);
        printlnRepeat(c);
    }
}
