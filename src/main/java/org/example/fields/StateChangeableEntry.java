package org.example.fields;

import java.util.List;

public record StateChangeableEntry<T>(
        T key,
        List<String> states
) implements StateChanger {

    public StateChangeableEntry(T key, String... states) {
        this(key, List.of(states));
    }

    @Override
    public List<String> getSetStates() {
        return null;
    }
}
