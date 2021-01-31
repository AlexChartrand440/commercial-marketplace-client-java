// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.meter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UsageEventConflictResponse model. */
@Fluent
public final class UsageEventConflictResponse {
    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The additionalInfo property.
     */
    @JsonProperty(value = "additionalInfo")
    private UsageEventConflictResponseAdditionalInfo additionalInfo;

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the UsageEventConflictResponse object itself.
     */
    public UsageEventConflictResponse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the additionalInfo property: The additionalInfo property.
     *
     * @return the additionalInfo value.
     */
    public UsageEventConflictResponseAdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Set the additionalInfo property: The additionalInfo property.
     *
     * @param additionalInfo the additionalInfo value to set.
     * @return the UsageEventConflictResponse object itself.
     */
    public UsageEventConflictResponse setAdditionalInfo(UsageEventConflictResponseAdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
}
