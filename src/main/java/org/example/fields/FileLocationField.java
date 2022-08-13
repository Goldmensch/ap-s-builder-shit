package org.example.fields;

import java.nio.file.Path;
import java.util.function.Function;

public final class FileLocationField extends Field<Path> {
    private final Path suggestion;
    private final Function<Path, String> infoText;

    public FileLocationField(Path placeholder, Function<Path, String> infoText) {
        this.suggestion = placeholder;
        this.infoText = infoText;
    }

    public Path getSuggestion() {
        return suggestion;
    }

    public Function<Path, String> getInfoText() {
        return infoText;
    }
}
