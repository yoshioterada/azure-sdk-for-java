// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An Event Hub endpoint. The managed identity of Web PubSub service must be enabled, and the identity should have the
 * "Azure Event Hubs Data sender" role to access Event Hub.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("EventHub")
@Fluent
public final class EventHubEndpoint extends EventListenerEndpoint {
    /*
     * The fully qualified namespace name of the Event Hub resource. For example, "example.servicebus.windows.net".
     */
    @JsonProperty(value = "fullyQualifiedNamespace", required = true)
    private String fullyQualifiedNamespace;

    /*
     * The name of the Event Hub.
     */
    @JsonProperty(value = "eventHubName", required = true)
    private String eventHubName;

    /** Creates an instance of EventHubEndpoint class. */
    public EventHubEndpoint() {
    }

    /**
     * Get the fullyQualifiedNamespace property: The fully qualified namespace name of the Event Hub resource. For
     * example, "example.servicebus.windows.net".
     *
     * @return the fullyQualifiedNamespace value.
     */
    public String fullyQualifiedNamespace() {
        return this.fullyQualifiedNamespace;
    }

    /**
     * Set the fullyQualifiedNamespace property: The fully qualified namespace name of the Event Hub resource. For
     * example, "example.servicebus.windows.net".
     *
     * @param fullyQualifiedNamespace the fullyQualifiedNamespace value to set.
     * @return the EventHubEndpoint object itself.
     */
    public EventHubEndpoint withFullyQualifiedNamespace(String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = fullyQualifiedNamespace;
        return this;
    }

    /**
     * Get the eventHubName property: The name of the Event Hub.
     *
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * Set the eventHubName property: The name of the Event Hub.
     *
     * @param eventHubName the eventHubName value to set.
     * @return the EventHubEndpoint object itself.
     */
    public EventHubEndpoint withEventHubName(String eventHubName) {
        this.eventHubName = eventHubName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (fullyQualifiedNamespace() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property fullyQualifiedNamespace in model EventHubEndpoint"));
        }
        if (eventHubName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property eventHubName in model EventHubEndpoint"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EventHubEndpoint.class);
}