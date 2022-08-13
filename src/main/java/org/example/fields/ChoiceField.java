package org.example.fields;

import java.util.*;

public final class ChoiceField extends Field<StateChangeableEntry<String>> {
    private final List<StateChangeableEntry<String>> choices = new LinkedList<>();

    public ChoiceField choice(String choice, String... states) {
        choices.add(new StateChangeableEntry<>(choice, states));
        return this;
    }

    public List<StateChangeableEntry<String>> getChoices() {
        return choices;
    }
}
