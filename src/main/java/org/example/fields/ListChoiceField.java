package org.example.fields;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public final class ListChoiceField extends Field<StateChangeableEntry<String>> {
    private final List<StateChangeableEntry<String>> choices = new LinkedList<>();

    public ListChoiceField choice(String choice, String... states) {
        choices.add(new StateChangeableEntry<>(choice, states));
        return this;
    }

    public ListChoiceField choices(Collection<StateChangeableEntry<String>> choices) {
        this.choices.addAll(choices);
        return this;
    }

    public List<StateChangeableEntry<String>> getChoices() {
        return choices;
    }
}
