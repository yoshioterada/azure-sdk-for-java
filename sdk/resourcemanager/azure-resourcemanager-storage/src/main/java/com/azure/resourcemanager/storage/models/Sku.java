// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SKU of the storage account.
 */
@Fluent
public final class Sku {
    /*
     * The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was called accountType.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The SKU tier. This is based on the SKU name.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * Creates an instance of Sku class.
     */
    public Sku() {
    }

    /**
     * Get the name property: The SKU name. Required for account creation; optional for update. Note that in older
     * versions, SKU name was called accountType.
     * 
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The SKU name. Required for account creation; optional for update. Note that in older
     * versions, SKU name was called accountType.
     * 
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The SKU tier. This is based on the SKU name.
     * 
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sku.class);
}
