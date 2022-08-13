package org.example;

import org.example.fields.Field;

public record MenuNode(
        String key,
        Field<?> field
) {
}
