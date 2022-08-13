package org.example;

import org.example.fields.CheckBoxField;
import org.example.fields.ChoiceField;
import org.example.fields.Field;
import org.example.fields.TextField;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MenuBuilder {

    private final List<MenuNode> fields = new LinkedList<>();

    public MenuBuilder field(String key, Field<?> field) {
        fields.add(new MenuNode(key, field));
        return this;
    }

    public MenuBuilder field(Field<?> field) {
        fields.add(new MenuNode(null, field));
        return this;
    }

    public Menu build() {
        return new Menu(fields);
    }


}
