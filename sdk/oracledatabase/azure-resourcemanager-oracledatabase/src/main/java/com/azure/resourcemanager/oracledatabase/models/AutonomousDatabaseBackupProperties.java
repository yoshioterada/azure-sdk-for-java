// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * AutonomousDatabaseBackup resource model.
 */
@Fluent
public final class AutonomousDatabaseBackupProperties {
    /*
     * The OCID of the Autonomous Database.
     */
    @JsonProperty(value = "autonomousDatabaseId", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String autonomousDatabaseId;

    /*
     * The size of the database in terabytes at the time the backup was taken.
     */
    @JsonProperty(value = "databaseSizeInTBs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer databaseSizeInTBs;

    /*
     * A valid Oracle Database version for Autonomous Database.
     */
    @JsonProperty(value = "dbVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String dbVersion;

    /*
     * The user-friendly name for the backup. The name does not have to be unique.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The OCID of the Autonomous Database backup.
     */
    @JsonProperty(value = "ocid", access = JsonProperty.Access.WRITE_ONLY)
    private String ocid;

    /*
     * Indicates whether the backup is user-initiated or automatic.
     */
    @JsonProperty(value = "isAutomatic", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isAutomatic;

    /*
     * Indicates whether the backup can be used to restore the associated Autonomous Database.
     */
    @JsonProperty(value = "isRestorable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isRestorable;

    /*
     * Additional information about the current lifecycle state.
     */
    @JsonProperty(value = "lifecycleDetails", access = JsonProperty.Access.WRITE_ONLY)
    private String lifecycleDetails;

    /*
     * The current state of the backup.
     */
    @JsonProperty(value = "lifecycleState", access = JsonProperty.Access.WRITE_ONLY)
    private AutonomousDatabaseBackupLifecycleState lifecycleState;

    /*
     * Retention period, in days, for long-term backups.
     */
    @JsonProperty(value = "retentionPeriodInDays")
    private Integer retentionPeriodInDays;

    /*
     * The backup size in terabytes (TB).
     */
    @JsonProperty(value = "sizeInTBs", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sizeInTBs;

    /*
     * Timestamp until when the backup will be available.
     */
    @JsonProperty(value = "timeAvailableTil", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeAvailableTil;

    /*
     * The date and time the backup completed.
     */
    @JsonProperty(value = "timeEnded", access = JsonProperty.Access.WRITE_ONLY)
    private String timeEnded;

    /*
     * The type of backup.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private AutonomousDatabaseBackupType type;

    /*
     * Azure resource provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AzureResourceProvisioningState provisioningState;

    /**
     * Creates an instance of AutonomousDatabaseBackupProperties class.
     */
    public AutonomousDatabaseBackupProperties() {
    }

    /**
     * Get the autonomousDatabaseId property: The OCID of the Autonomous Database.
     * 
     * @return the autonomousDatabaseId value.
     */
    public String autonomousDatabaseId() {
        return this.autonomousDatabaseId;
    }

    /**
     * Get the databaseSizeInTBs property: The size of the database in terabytes at the time the backup was taken.
     * 
     * @return the databaseSizeInTBs value.
     */
    public Integer databaseSizeInTBs() {
        return this.databaseSizeInTBs;
    }

    /**
     * Get the dbVersion property: A valid Oracle Database version for Autonomous Database.
     * 
     * @return the dbVersion value.
     */
    public String dbVersion() {
        return this.dbVersion;
    }

    /**
     * Get the displayName property: The user-friendly name for the backup. The name does not have to be unique.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The user-friendly name for the backup. The name does not have to be unique.
     * 
     * @param displayName the displayName value to set.
     * @return the AutonomousDatabaseBackupProperties object itself.
     */
    public AutonomousDatabaseBackupProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the ocid property: The OCID of the Autonomous Database backup.
     * 
     * @return the ocid value.
     */
    public String ocid() {
        return this.ocid;
    }

    /**
     * Get the isAutomatic property: Indicates whether the backup is user-initiated or automatic.
     * 
     * @return the isAutomatic value.
     */
    public Boolean isAutomatic() {
        return this.isAutomatic;
    }

    /**
     * Get the isRestorable property: Indicates whether the backup can be used to restore the associated Autonomous
     * Database.
     * 
     * @return the isRestorable value.
     */
    public Boolean isRestorable() {
        return this.isRestorable;
    }

    /**
     * Get the lifecycleDetails property: Additional information about the current lifecycle state.
     * 
     * @return the lifecycleDetails value.
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }

    /**
     * Get the lifecycleState property: The current state of the backup.
     * 
     * @return the lifecycleState value.
     */
    public AutonomousDatabaseBackupLifecycleState lifecycleState() {
        return this.lifecycleState;
    }

    /**
     * Get the retentionPeriodInDays property: Retention period, in days, for long-term backups.
     * 
     * @return the retentionPeriodInDays value.
     */
    public Integer retentionPeriodInDays() {
        return this.retentionPeriodInDays;
    }

    /**
     * Set the retentionPeriodInDays property: Retention period, in days, for long-term backups.
     * 
     * @param retentionPeriodInDays the retentionPeriodInDays value to set.
     * @return the AutonomousDatabaseBackupProperties object itself.
     */
    public AutonomousDatabaseBackupProperties withRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    /**
     * Get the sizeInTBs property: The backup size in terabytes (TB).
     * 
     * @return the sizeInTBs value.
     */
    public Integer sizeInTBs() {
        return this.sizeInTBs;
    }

    /**
     * Get the timeAvailableTil property: Timestamp until when the backup will be available.
     * 
     * @return the timeAvailableTil value.
     */
    public OffsetDateTime timeAvailableTil() {
        return this.timeAvailableTil;
    }

    /**
     * Get the timeEnded property: The date and time the backup completed.
     * 
     * @return the timeEnded value.
     */
    public String timeEnded() {
        return this.timeEnded;
    }

    /**
     * Get the type property: The type of backup.
     * 
     * @return the type value.
     */
    public AutonomousDatabaseBackupType type() {
        return this.type;
    }

    /**
     * Get the provisioningState property: Azure resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public AzureResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
