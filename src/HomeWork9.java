import bte.util.StringUtils;

import java.util.Scanner;

import static bte.util.StringUtils.*;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your text ...");
        String sentenceFromConsole = scanner.nextLine();

        printLongestWord(sentenceFromConsole);
        printShortestWord(sentenceFromConsole);
        startEndSameLetter(sentenceFromConsole);
        printReplace(sentenceFromConsole);
        eachWord(sentenceFromConsole);
    }
}
