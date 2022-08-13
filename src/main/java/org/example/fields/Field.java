package org.example.fields;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public sealed abstract class Field<T> permits CheckBoxField, ChoiceField, FileLocationField, ListChoiceField, TextField {
    private final List<Field<?>> children = new LinkedList<>();
    private final List<String> requiredStates = new LinkedList<>();

    private Consumer<T> action = (a) -> {};

    public Field<T> reqStates(String... states) {
        requiredStates.addAll(List.of(states));
        return this;
    }

    public Field<T> child(Field<?> field) {
        children.add(field);
        return this;
    }

    public Field<T> action(Consumer<T> action) {
        this.action = action;
        return this;
    }

    public List<Field<?>> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public List<String> getRequiredStates() {
        return Collections.unmodifiableList(requiredStates);
    }

    public Consumer<T> getAction() {
        return action;
    }
}
