// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.elevation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for JsonFormat.
 */
public final class JsonFormat extends ExpandableStringEnum<JsonFormat> {
    /**
     * [The JavaScript Object Notation Data Interchange Format](https://tools.ietf.org/html/rfc8259).
     */
    public static final JsonFormat JSON = fromString("json");

    /**
     * Creates a new instance of JsonFormat value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public JsonFormat() {
    }

    /**
     * Creates or finds a JsonFormat from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JsonFormat.
     */
    public static JsonFormat fromString(String name) {
        return fromString(name, JsonFormat.class);
    }

    /**
     * Gets known JsonFormat values.
     * 
     * @return known JsonFormat values.
     */
    public static Collection<JsonFormat> values() {
        return values(JsonFormat.class);
    }
}
