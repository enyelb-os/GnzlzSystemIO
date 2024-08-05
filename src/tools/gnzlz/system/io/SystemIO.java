package tools.gnzlz.system.io;

import tools.gnzlz.system.io.functional.FunctionInputProcess;
import tools.gnzlz.system.io.functional.FunctionOutputProcess;

import java.util.Scanner;

public class SystemIO {

    /**
     * OUT
     */
    public static FunctionOutputProcess OUT = System.out::print;

    /**
     * INP
     */
    public static FunctionInputProcess INP = new Scanner(System.in)::nextLine;
}
