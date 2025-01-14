// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for AutonomousDatabases Delete.
 */
public final class AutonomousDatabasesDeleteSamples {
    /*
     * x-ms-original-file: specification/oracle/resource-manager/Oracle.Database/preview/2023-09-01-preview/examples/autonomousDatabase_delete.json
     */
    /**
     * Sample code: Delete Autonomous Database.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        deleteAutonomousDatabase(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.autonomousDatabases().delete("rg000", "databasedb1", com.azure.core.util.Context.NONE);
    }
}
