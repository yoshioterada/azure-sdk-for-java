// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Location metadata information.
 */
@Fluent
public final class LocationMetadata {
    /*
     * The type of the region.
     */
    @JsonProperty(value = "regionType", access = JsonProperty.Access.WRITE_ONLY)
    private RegionType regionType;

    /*
     * The category of the region.
     */
    @JsonProperty(value = "regionCategory", access = JsonProperty.Access.WRITE_ONLY)
    private RegionCategory regionCategory;

    /*
     * The geography of the location.
     */
    @JsonProperty(value = "geography", access = JsonProperty.Access.WRITE_ONLY)
    private String geography;

    /*
     * The geography group of the location.
     */
    @JsonProperty(value = "geographyGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String geographyGroup;

    /*
     * The longitude of the location.
     */
    @JsonProperty(value = "longitude", access = JsonProperty.Access.WRITE_ONLY)
    private String longitude;

    /*
     * The latitude of the location.
     */
    @JsonProperty(value = "latitude", access = JsonProperty.Access.WRITE_ONLY)
    private String latitude;

    /*
     * The physical location of the Azure location.
     */
    @JsonProperty(value = "physicalLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String physicalLocation;

    /*
     * The regions paired to this region.
     */
    @JsonProperty(value = "pairedRegion")
    private List<PairedRegion> pairedRegion;

    /*
     * The home location of an edge zone.
     */
    @JsonProperty(value = "homeLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String homeLocation;

    /**
     * Creates an instance of LocationMetadata class.
     */
    public LocationMetadata() {
    }

    /**
     * Get the regionType property: The type of the region.
     * 
     * @return the regionType value.
     */
    public RegionType regionType() {
        return this.regionType;
    }

    /**
     * Get the regionCategory property: The category of the region.
     * 
     * @return the regionCategory value.
     */
    public RegionCategory regionCategory() {
        return this.regionCategory;
    }

    /**
     * Get the geography property: The geography of the location.
     * 
     * @return the geography value.
     */
    public String geography() {
        return this.geography;
    }

    /**
     * Get the geographyGroup property: The geography group of the location.
     * 
     * @return the geographyGroup value.
     */
    public String geographyGroup() {
        return this.geographyGroup;
    }

    /**
     * Get the longitude property: The longitude of the location.
     * 
     * @return the longitude value.
     */
    public String longitude() {
        return this.longitude;
    }

    /**
     * Get the latitude property: The latitude of the location.
     * 
     * @return the latitude value.
     */
    public String latitude() {
        return this.latitude;
    }

    /**
     * Get the physicalLocation property: The physical location of the Azure location.
     * 
     * @return the physicalLocation value.
     */
    public String physicalLocation() {
        return this.physicalLocation;
    }

    /**
     * Get the pairedRegion property: The regions paired to this region.
     * 
     * @return the pairedRegion value.
     */
    public List<PairedRegion> pairedRegion() {
        return this.pairedRegion;
    }

    /**
     * Set the pairedRegion property: The regions paired to this region.
     * 
     * @param pairedRegion the pairedRegion value to set.
     * @return the LocationMetadata object itself.
     */
    public LocationMetadata withPairedRegion(List<PairedRegion> pairedRegion) {
        this.pairedRegion = pairedRegion;
        return this;
    }

    /**
     * Get the homeLocation property: The home location of an edge zone.
     * 
     * @return the homeLocation value.
     */
    public String homeLocation() {
        return this.homeLocation;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pairedRegion() != null) {
            pairedRegion().forEach(e -> e.validate());
        }
    }
}
