// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpdateOperation model. */
@Fluent
public final class UpdateOperation {
    /*
     * The planId property.
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * The quantity property.
     */
    @JsonProperty(value = "quantity")
    private Long quantity;

    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private UpdateOperationStatusEnum status;

    /**
     * Get the planId property: The planId property.
     *
     * @return the planId value.
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * Set the planId property: The planId property.
     *
     * @param planId the planId value to set.
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the quantity property: The quantity property.
     *
     * @return the quantity value.
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The quantity property.
     *
     * @param quantity the quantity value to set.
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public UpdateOperationStatusEnum getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the UpdateOperation object itself.
     */
    public UpdateOperation setStatus(UpdateOperationStatusEnum status) {
        this.status = status;
        return this;
    }
}
