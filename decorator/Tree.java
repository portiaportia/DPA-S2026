package decorator;

import java.util.ArrayList;

public abstract class Tree {
    private static final String RESET = "\033[0m";  // Text Reset
    private static final String GREEN = "\033[0;32m";   // GREEN
    private static final String WHITE = "\033[0;37m";   // WHITE
    private static final String RED = "\033[0;31m";     // RED
    private static final String YELLOW = "\033[0;33m";  // YELLOW
    private static final String BROWN = "\u001B[38;2;139;69;19m"; // RGB: 139, 69, 19

    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines) {
        this.lines = lines;
    }

    public String toString() {
        String result = "";

        for (String line : lines) {
            String temp = line.replaceAll("G", " " + GREEN);
            temp = temp.replaceAll("B", " " + BROWN);
            temp = temp.replaceAll("W(.)", " " + WHITE + "$1" + GREEN);
            temp = temp.replaceAll("R(..)", " " + RED + "$1" + GREEN);
            temp = temp.replaceAll("Y(.)Y(.)", " " + YELLOW + "$1$2" + GREEN);
            temp = temp.replaceAll("Y(.)", " " + YELLOW + "$1" + GREEN);
            result += temp +"\n";
        }

        return result + RESET;
    }
}