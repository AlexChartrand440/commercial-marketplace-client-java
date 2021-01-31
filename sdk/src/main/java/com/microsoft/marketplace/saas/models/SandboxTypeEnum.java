// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SandboxTypeEnum. */
public enum SandboxTypeEnum {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Csp. */
    CSP("Csp");

    /** The actual serialized value for a SandboxTypeEnum instance. */
    private final String value;

    SandboxTypeEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SandboxTypeEnum instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SandboxTypeEnum object, or null if unable to parse.
     */
    @JsonCreator
    public static SandboxTypeEnum fromString(String value) {
        SandboxTypeEnum[] items = SandboxTypeEnum.values();
        for (SandboxTypeEnum item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
