package org.example;

import org.example.fields.*;

import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<StateChangeableEntry<String>> javaVersion = List.of();
        var menu = new MenuBuilder()
                .field("Name", new TextField())
                .field("Location", new FileLocationField(Path.of("Z:", "Undefined"),
                            path -> "Project will be be crated in: " + path.toString()
                        )
                        .action(path -> { /* do stuff */})
                        .child(new CheckBoxField("Create Git repository"))
                )
                .field("Language", new ListChoiceField()
                        .choice("Java", "java")
                        .choice("Kotlin", "kotlin")
                        .choice("Groovy", "groovy")
                        .choice("JavaScript", "js")
                        .action(lang -> { /* do stuff */})
                )
                .field("Build System", new ChoiceField()
                        .choice("IntelliJ")
                        .choice("Maven")
                        .choice("Gradle")
                        .reqStates("java", "kotlin", "groovy")
                        .action(buildSystem -> { /* do stuff */})
                )
                .field("JDK", new ListChoiceField()
                        .choices(javaVersion)
                        .reqStates("java", "kotlin", "groovy")
                        .action(jdk -> { /* do stuff */})
                )
                .field(new CheckBoxField("Add sample code")
                        .action(sampleCode -> { /* do stuff*/ }))
                .build();

    }
}