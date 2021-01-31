// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;

/** Initializes a new instance of the SaaSAPI type. */
public final class SaaSAPI {
    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The FulfillmentOperations object to access its operations. */
    private final FulfillmentOperations fulfillmentOperations;

    /**
     * Gets the FulfillmentOperations object to access its operations.
     *
     * @return the FulfillmentOperations object.
     */
    public FulfillmentOperations getFulfillmentOperations() {
        return this.fulfillmentOperations;
    }

    /** The SubscriptionOperations object to access its operations. */
    private final SubscriptionOperations subscriptionOperations;

    /**
     * Gets the SubscriptionOperations object to access its operations.
     *
     * @return the SubscriptionOperations object.
     */
    public SubscriptionOperations getSubscriptionOperations() {
        return this.subscriptionOperations;
    }

    /** Initializes an instance of SaaSAPI client. */
    SaaSAPI(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                host);
    }

    /**
     * Initializes an instance of SaaSAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    SaaSAPI(HttpPipeline httpPipeline, String host) {
        this.httpPipeline = httpPipeline;
        this.host = host;
        this.apiVersion = "2018-08-31";
        this.fulfillmentOperations = new FulfillmentOperations(this);
        this.subscriptionOperations = new SubscriptionOperations(this);
    }
}
