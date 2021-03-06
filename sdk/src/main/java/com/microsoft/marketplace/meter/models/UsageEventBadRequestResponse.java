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
import java.util.List;

/** The UsageEventBadRequestResponse model. */
@Fluent
public final class UsageEventBadRequestResponse {
    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The target property.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private List<UsageEventBadRequestResponseDetail> details;

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
     * @return the UsageEventBadRequestResponse object itself.
     */
    public UsageEventBadRequestResponse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the UsageEventBadRequestResponse object itself.
     */
    public UsageEventBadRequestResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target property.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     *
     * @param target the target value to set.
     * @return the UsageEventBadRequestResponse object itself.
     */
    public UsageEventBadRequestResponse setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public List<UsageEventBadRequestResponseDetail> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the UsageEventBadRequestResponse object itself.
     */
    public UsageEventBadRequestResponse setDetails(List<UsageEventBadRequestResponseDetail> details) {
        this.details = details;
        return this;
    }
}
