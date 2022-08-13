package org.example.fields;

import java.util.LinkedList;
import java.util.List;

public final class CheckBoxField extends Field<Boolean> implements StateChanger {
    private final String description;
    private final List<String> setStates;

    public CheckBoxField(String description, String... states) {
        this.description = description;
        this.setStates = List.of(states);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public List<String> getSetStates() {
        return setStates;
    }
}
