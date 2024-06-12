package pl.zajavka.structuralDesignPatterns.decorator;

import org.jsoup.nodes.Attribute;

public class AttributeAfterDecorator extends AttributeDecorator{
    public AttributeAfterDecorator(Attribute attribute) {
        super(attribute);
    }

    @Override
    public String getKey() {
        String key = super.getKey();
        System.out.println("Decorating after getKey()");
        return key;
    }
}
