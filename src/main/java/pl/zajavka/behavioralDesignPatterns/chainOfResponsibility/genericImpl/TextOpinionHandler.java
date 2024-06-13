package pl.zajavka.behavioralDesignPatterns.chainOfResponsibility.genericImpl;

public class TextOpinionHandler extends GenericHandler<String>{
    @Override
    protected String handleInput(String input) {
        return input.replace("mam zla opinie o zajavce", "zajavka jest super");
    }
}
