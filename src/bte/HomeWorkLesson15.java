package bte;

import bte.anatation.processor.BtaNumberProcessor;
import bte.anatation.processor.BtaStringProcessor;
import bte.model.Developer;

public class HomeWorkLesson15 {
    public static void main(String[] args) {

        Developer employToProcess = new Developer(35, "Max", 20_000, "java");
        Developer employToProcess2 = new Developer(35, "Alan", 30_000, "java");
        BtaStringProcessor.getInstance().process(employToProcess);
        BtaStringProcessor.getInstance().process(employToProcess2);
        BtaNumberProcessor.getInstance().process(employToProcess);
    }
}
