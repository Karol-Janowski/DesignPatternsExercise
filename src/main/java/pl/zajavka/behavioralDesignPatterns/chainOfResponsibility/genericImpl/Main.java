package pl.zajavka.behavioralDesignPatterns.chainOfResponsibility.genericImpl;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // generic impl of chain of responsibility

//        GenericHandler<String> textBugHandler = new TextBugHandler();
//        GenericHandler<String> textOpinionHandler = new TextOpinionHandler();
//        GenericHandler<String> textZajavkaHandler = new TextZajavkaHandler();
//        textBugHandler.setNextHandler(textOpinionHandler);
//        textOpinionHandler.setNextHandler(textZajavkaHandler);

        // functional approach

        UnaryOperator<String> textZajavkaHandler = (String input) ->
                input.replace("zajavka nie jest super", "zajavka jest super");
        UnaryOperator<String> textBugHandler = (String input) ->
                input.replace("w zadaniu jest blad", "w zadaniu nie ma bledu");
        UnaryOperator<String> textOpinionHandler = (String input) ->
                input.replace("mam zla opinie o zajavce", "zajavka jest super");

        Function<String, String> pipeline = textZajavkaHandler
                .andThen(textBugHandler)
                .andThen(textOpinionHandler);


        String input = "wzialem udzial w zajavce i powiem wam ze zajavka nie jest super. " +
                "Zrobilem zadanie i w zadaniu jest blad. " +
                "Podsumowujac mam zla opinie o zajavce. ";

        String result = pipeline.apply(input);
        System.out.println(result);



    }
}
