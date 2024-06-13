package pl.zajavka.behavioralDesignPatterns.chainOfResponsibility.genericImpl;

public class TextZajavkaHandler extends GenericHandler<String>{
    @Override
    protected String handleInput(String input) {
        return input.replace("zajavka nie jest super", "zajavka jest super");
    }
}
